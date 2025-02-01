package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class SaveTeacher 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	
		String query="insert into teacher (id,name,schoolName) values(?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1, 1003);
		statement.setString(2, "Satish Shinde");
		statement.setString(3, "IBM");
		
		int rowsInserted = statement.executeUpdate();
		
		if(rowsInserted==1)
			System.out.println("Data Inserted Successfully");
		else
			System.out.println("Something went Wrong");
		
		statement.close();
		connection.close();
	}
}
