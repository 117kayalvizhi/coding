package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Like {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			Statement s=c.createStatement();
			ResultSet rs=s.executeQuery("select * from product  where pname like '%m'");
			   
		    while(rs.next()) {
		      System.out.println("pid= "+ rs.getInt(1));
		      System.out.println("name= "+ rs.getString(2));
		      System.out.println("price= "+ rs.getDouble(3));
		      System.out.println("quantity= "+ rs.getInt(4));
		      System.out.println("rating= "+ rs.getDouble(5));         
		      System.out.println("---------------------------");
		    }
			
		} catch (ClassNotFoundException|SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}


