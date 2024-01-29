package com;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Driver {
  public static void main(String[] args) throws SQLException, ClassNotFoundException {
	java.sql.Driver d=new com.mysql.cj.jdbc.Driver();
	DriverManager.registerDriver(d);
	
	//second way
	Class.forName("com.mysql.cj.jdbc.Driver");
	
}
}
