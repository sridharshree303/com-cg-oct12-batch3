package cg.oct12.batch3.day12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcDemo2 {

	public static void main(String[] args)   {
		
	//	String className = "org.postgresql.Driver";
		String jdbcurl = "jdbc:postgresql://localhost:5432/DVDRENTAL";
		String username = "postgres";
		String password = "Asdf@123";
		
		try {
		
			Connection connection = DriverManager.getConnection(jdbcurl,username,password);     
			System.out.println("Connected to postgreSql server");
			
			String sql = "CREATE TABLE jdbcDemo (id int ,marks int)";
			String sql1 = "INSERT INTO jdbcdemo values(1,16),(2,20)";
			
			
		/*	Statement statement = connection.createStatement();
			int rows = statement.executeUpdate(sql);
			if(rows>0) {
				System.out.println("A new table has been created");
			}
		*/	
			PreparedStatement statement1 = connection.prepareStatement(sql1);
			int rows1 = statement1.executeUpdate(sql1);
			if(rows1>0) {
				System.out.println("Data inserted into table jdbcdemo");
			}
			
			
			connection.close();
			
		}catch(SQLException e){
			System.out.println("Error in connection to PostgreSQL server");
			e.printStackTrace();
		}

	}

}
