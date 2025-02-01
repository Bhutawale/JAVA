package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class UpdateTeacher 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
	
		System.out.println("Enter Id to be updated: ");
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		
		//Getting the teacher data from database to update if exist
		String selectQuery="select * from teacher where id=?";
		PreparedStatement selectStatement = connection.prepareStatement(selectQuery);
		selectStatement.setInt(1, id);
		ResultSet resultSet = selectStatement.executeQuery();
		if(resultSet.next())
		{
			do
			{
				System.out.println("Teacher Id: "+resultSet.getInt(1));
				System.out.println("Teacher Name: "+resultSet.getString(2));
				System.out.println("Teacher School Name: "+resultSet.getString(3));
			}while(resultSet.next());
			
			System.out.println("Enter new teacher name: ");
			String name=scan.next();
			
			System.out.println("Enter new School Name: ");
			String schoolName=scan.next();
			
			
			String updateQuery="update teacher set schoolName=?,name=? where id=?";
			
			PreparedStatement Updatestatement = connection.prepareStatement(updateQuery);
			
			Updatestatement.setString(1, schoolName);
			Updatestatement.setString(2, name);
			Updatestatement.setInt(3, id);
			
			int executeUpdate = Updatestatement.executeUpdate();
			
			if(executeUpdate>0)
			{
				System.out.println("Teacher Updated Successfully");
			}
			else
			{
				System.out.println("Something wenr wrong");
			}
			Updatestatement.close();
		}
		else
		{
			System.out.println("No teacher with given Id exist.");
		}
	
		scan.close();
		connection.close();
	}
}
