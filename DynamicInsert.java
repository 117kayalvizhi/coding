package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class DynamicInsert {
	public static void main(String[] args) {
	  Scanner sc= new  Scanner(System.in);
		System.out.println("enter the pid");
		int pid=sc.nextInt();
		System.out.println("enter the pname:");
		String pname=sc.next();
		System.out.println("enter the price:");
		double price=sc.nextDouble();
		System.out.println("enter the quantity:");
		int quantity=sc.nextInt();
		System.out.println("enter the rating:");
		double rating=sc.nextDouble();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			PreparedStatement ps=c.prepareStatement("insert into product values(?,?,?,?,?)");
			ps.setInt(1,pid);
			ps.setString(2,pname);
			ps.setDouble(3, price);
			ps.setInt(4, quantity);
			ps.setDouble(5, rating);
			ps.executeUpdate();
			System.out.println("inserted");
			
		} catch (ClassNotFoundException |SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
