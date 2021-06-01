package com.javacode;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connector {
	
	     static Connection connection ;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {

			Class.forName("com.mysql.jdbc.Driver");
		    connection = DriverManager .getConnection("jdbc:mysql://localhost:3306/cars", "root", "root");
		    System.out.println("Connected to database");

		    return connection;
	}
}
