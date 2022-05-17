package ai.jobiak.Jdbc;

import java.sql.*;
public class TestJdbc1 {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		}catch (ClassNotFoundException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connected to db............");
			
			Statement st=con.createStatement();
			String selectSQL="select * from country";
			
			ResultSet rs=st.executeQuery(selectSQL);
			
			while(rs.next()) {
				System.out.println(rs.getString(1)  + "::"+rs.getString(2)+"::"+rs.getString(3));
			}
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
