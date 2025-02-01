package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeletePerson 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root", "root");
		
		String query="delete from person where id='102'";
		
		Statement statement = connection.createStatement();
		
		int deletedRows = statement.executeUpdate(query);
		
		if(deletedRows>0)
		{
			System.out.println("Rows Deleted: "+deletedRows);
		}
		else
		{
			System.out.println("No id found.");
		}
		
		statement.close();
		
		connection.close();
	}
}
