package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FindAllEmp 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student","root","root");
		Statement statement = connection.createStatement();
		String sql="select * from emp";
		ResultSet resultSet = statement.executeQuery(sql);
		while(resultSet.next())
		{
			System.out.println(resultSet.getInt(1));
			System.out.println(resultSet.getString(2));
			System.out.println(resultSet.getString(3));
		}
	}
}
