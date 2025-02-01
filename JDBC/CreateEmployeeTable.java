package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateEmployeeTable 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Student", "root", "root");
		
		Statement statement = connection.createStatement();
		
		String query="create table employee(id int primary key,name varchar(20),city varchar(20))";
		
		statement.executeUpdate(query);
		
		System.out.println("Table Created Successfully");
		
		statement.close();
		
		connection.close();
	}
}
