package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SavePerson 
{
	public static void main(String[] args) 
	{
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
			
			String query="insert into person (id,name,city) values (?,?,?)";
			
			PreparedStatement statement = connection.prepareStatement(query);
			
			statement.setInt(1, 103);
			statement.setString(2, "Raj");
			statement.setString(3, "Thane");
			
			statement.execute();
			
			System.out.println("Data inserted successfully");
			
			statement.close();
			
			connection.close();
		}
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
}
