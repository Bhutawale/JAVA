package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetAllPersons 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		String query="select * from person";
		
		Statement statement = connection.createStatement();
		
		ResultSet resultSet = statement.executeQuery(query);
		
		while(resultSet.next())
		{
			System.out.print(resultSet.getInt(1)+" ");
			System.out.print(resultSet.getString(2)+" ");
			System.out.print(resultSet.getString(3));
			System.out.println();
		}
		
		statement.close();
		
		connection.close();
	}
}
