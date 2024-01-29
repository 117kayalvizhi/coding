package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			Statement s=c.createStatement();
			s.executeUpdate("delete from product where pid =2");
			System.out.println("date removed");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
