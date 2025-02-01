package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteTeacher 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/student", "root", "root");
		
		System.out.println("Enter the teacher id to be deleted: ");
		Scanner scan=new Scanner(System.in);
		int id=scan.nextInt();
		
		
		String query="delete from teacher where id=?";

		PreparedStatement statement = connection.prepareStatement(query);
		
		statement.setInt(1, id);
		
		int deletedRow = statement.executeUpdate();
		
		if(deletedRow==1)
		{
			System.out.println("Teacher with id "+id+" successfully deleted");
		}
		else
		{
			System.out.println("No teacher with given id exist");
		}
		
		scan.close();
		statement.close();
		connection.close();
	}
}
