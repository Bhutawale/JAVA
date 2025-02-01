package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class GetAllTeachers 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		Statement statement = connection.createStatement();
		
		String query="select * from teacher";
		
		ResultSet resultSet = statement.executeQuery(query);
		
		if(resultSet.next())
		{
			do
			{
				System.out.println(resultSet.getInt("id"));
				System.out.println(resultSet.getString("name"));
				System.out.println(resultSet.getString("schoolName"));
				System.out.println();
			}while(resultSet.next());
		}
		else
		{
			System.out.println("No Data found in the database");
		}
		statement.close();
		
		connection.close();
	}
}
