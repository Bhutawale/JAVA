package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEmployee 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
		
		String query="update employee set name='Rahul' where id='1'";
		
		Statement statement = connection.createStatement();
		
		int update = statement.executeUpdate(query);
		
		System.out.println("Total rows updated: "+update);
		
		statement.close();
		
		connection.close();
	}
}
