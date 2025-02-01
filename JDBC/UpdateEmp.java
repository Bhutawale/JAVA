package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class UpdateEmp 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement statement = connection.createStatement();
		String query="update emp set name='Rahul' where id='3'";
		int update = statement.executeUpdate(query);
		System.out.println("Rows Updated: "+update);
		statement.close();
		connection.close();
	}
}
