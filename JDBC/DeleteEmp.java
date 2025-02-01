package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class DeleteEmp
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		Statement statement = connection.createStatement();
		String query="delete from emp  where id=1";
		int executeUpdate = statement.executeUpdate(query);
		System.out.println("Rows Deleted: "+executeUpdate);
		statement.close();
		connection.close();
	}
}
