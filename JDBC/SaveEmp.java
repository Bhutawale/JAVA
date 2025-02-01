package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmp 
{
	public static void main(String[] args) 
	{
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
			Statement statement = connection.createStatement();
			String query="insert into emp(id,name,city) values (3,'sachin','Pune')";
			statement.execute(query);
			System.out.println("Data added successfully");	
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
