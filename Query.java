package com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Query {

	  public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
	    System.out.println("enter the starting price");
	    double start_price=sc.nextDouble();
	    System.out.println("enter the ending price");
	    double end_price = sc.nextDouble();
	    
	    try {
	      Class.forName("com.mysql.cj.jdbc.Driver");
	      Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/product_db","root","root");
	      PreparedStatement ps= c.prepareStatement("select * from product where price between ? and ?");
	      ps.setDouble(1,start_price);
	      ps.setDouble(2,end_price);
	      
	      ResultSet rs=ps.executeQuery();
	      
	      while(rs.next());{
	      System.out.println("pid ="+ rs.getInt(1));
	      System.out.println("price ="+ rs.getString(2));
	      System.out.println("pname="+ rs.getDouble(3));
	      System.out.println("quantity ="+ rs.getInt(4));
	      System.out.println("rating ="+ rs.getDouble(5));
	      }
	      
	      
	      
	      
	    } catch (ClassNotFoundException | SQLException e){
	      e.printStackTrace();
	      
	    
	    
	    }
	    
	    
	    
	  }
	    
	  }

	