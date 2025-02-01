package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTeacherTable 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		Statement statement = connection.createStatement();
		
		String query="create table teacher (id int primary key,name varchar(20), schoolName varchar(20))";
		
		statement.execute(query);
		
		System.out.println("Table created succesfully.");
		
		statement.close();
		
		connection.close();
	}
}
