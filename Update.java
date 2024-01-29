package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection c =DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
			Statement s=c.createStatement();
            s.executeUpdate("update product set pid=1,pname='maggi',price=10,quantity=4,rating=4.5");//it will affected the count. so it return type is int .it will return the no of rows affected
            System.out.println("update data");
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
	}

}
