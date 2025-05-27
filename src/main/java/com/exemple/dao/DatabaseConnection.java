package com.exemple.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class DatabaseConnection {
	//jdbc:mysql://localhost:3306/database-name
	
	private final static String Url="jdbc:mysql://localhost:3306/persondb";
	private final static String Password="";
	private final static String Username="root";
	
	private static Connection connection;
	
	public static Connection getConnection()
	{
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		connection=DriverManager.getConnection(Url, Username,Password);
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}
		return connection;
	}
}
