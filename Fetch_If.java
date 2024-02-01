package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;
public class Fetch_If {
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	        System.out.println("which data you can want? : ");
	    int pid=sc.nextInt();
	  
	    try {
	      
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
	      
	      PreparedStatement ps= c.prepareStatement("select pname,price from product where pid=?");
	      ps.setInt(1, pid);
	      
	      ResultSet rs =ps.executeQuery();
	      
	      if(rs.next()){
	        
	        System.out.println("PNAME : " +rs.getString(1));
	        System.out.println("PRICE : "+rs.getDouble(2));  
	      }
	    }
	      catch (ClassNotFoundException | SQLException e) {
	        e.printStackTrace();
	      }
	       }

	}

