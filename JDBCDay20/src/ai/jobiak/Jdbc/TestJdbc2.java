package ai.jobiak.Jdbc;

import java.sql.*;
import java.sql.*;
//import com.mysql.cj.jdbc.DatabaseMetaData;
public class TestJdbc2 {

	public static void main(String[] args) {
		
		/*
		 * try { Class.forName("com.mysql.cj.jdbc.Driver"); }catch
		 * (ClassNotFoundException e) { // TODO: handle exception e.printStackTrace(); }
		 */
		
		String userName="root";
		String password="admin";
		String url="jdbc:mysql://localhost:3306/world";
		try {
			Connection con=DriverManager.getConnection(url,userName,password);
			System.out.println("Connected to db............");
			
			//DatabaseMetaData dmd=con.getMetaData();
			//System.out.println(dmd.getDriverName());
			
			DatabaseMetaData dmd = con.getMetaData();
            System.out.println(dmd.getDriverName());
            System.out.println(dmd.getDriverVersion());
            System.out.println(dmd.getDriverMinorVersion());
            System.out.println(dmd.getDatabaseProductName());

            
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}

}
