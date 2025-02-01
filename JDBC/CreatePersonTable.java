package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreatePersonTable 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="root";
		
		Connection connection = DriverManager.getConnection(url, username, password);
		
		Statement statement = connection.createStatement();
		
		String query="create table person(id int primary key,name varchar(20),city varchar(20))";
		
		statement.executeUpdate(query);
		
		System.out.println("Table created successfully");
		
		statement.close();
		
		connection.close();
	}
}
