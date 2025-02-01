package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee
{
	public static void main(String[] args) throws Exception
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		
		Statement statement = connection.createStatement();
		
		String query="insert into employee(id,name,city) values(1, 'Satya', 'Thane')";
		
		statement.execute(query);
		
		System.out.println("Employee Saved successfully");
		
		statement.close();
		
		connection.close();
	}
}
