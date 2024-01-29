package com;


	import java.sql.DriverManager;
	import java.sql.SQLException;
	public class Connection {
	
	  public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			System.out.println("hello");
		}
		catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}		

	}
	}