package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdatePerson 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		Statement statement = connection.createStatement();
		
		String query="update person set name='Suyog Bhutawale' where id='1013'";
		
		int update = statement.executeUpdate(query);
		
		if(update>0)
		{
			System.out.println("Total updated rows: "+update);
		}
		else
		{
			System.out.println("Record with given id does not exist.");
		}
		statement.close();
		
		connection.close();
	}
}
