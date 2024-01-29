package com;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Insert {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("insert  into product  values(2,'biscuit',20,4,4.5)");
			
			System.out.println("data svaed");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}
	
	
	

}
