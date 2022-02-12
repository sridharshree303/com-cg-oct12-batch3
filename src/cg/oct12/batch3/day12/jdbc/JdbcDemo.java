package cg.oct12.batch3.day12.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
// download postgres jdbc jar and add to classpath 

public class JdbcDemo {
	public static void main(String[] args) {
		System.out.println("Start");

		String className = "org.postgresql.Driver";                                     // mandatory
		String url = "jdbc:postgresql://localhost:5432/DVDRENTAL"; // check this
		
		String user = "postgres";
		String password = "Asdf@123"; // check this
		
		String sql = "SELECT * FROM actor";
		
		try {
			Class.forName(className);
			Connection con = DriverManager.getConnection(url, user, password);
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while (rs.next()) {
				int columnIndex = 1;
				for (int i = 1; i <= 3; i++) {
					System.out.print(rs.getString(columnIndex) + "\t");
					columnIndex++;
				}
				System.out.println("\n");
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException cnfe) {
			cnfe.printStackTrace();
		}
	}

}
