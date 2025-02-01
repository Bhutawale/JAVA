package com.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

public class SaveMultipleEmployees 
{
	public static void main(String[] args) throws Exception 
	{
		Class.forName("com.mysql.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/student";
		String username="root";
		String password="root";
		Connection connection = DriverManager.getConnection(url, username, password);
		
		List<String[]> empList=new ArrayList<String[]>();
		empList.add(new String[] {"2","Satish","Kalyan"});
		empList.add(new String[] {"3","Sagar","Neral"});
		empList.add(new String[] {"4","Swapnil","Badlapur"});
		empList.add(new String[] {"5","Sarang","Thane"});
		empList.add(new String[] {"6","Swarup","Ulhasnagar"});
		
		String query="insert into employee(id,name,city) values(?,?,?)";
		
		PreparedStatement statement = connection.prepareStatement(query);
		
		for(String[] employee:empList)
		{
			statement.setString(1, employee[0]);
			statement.setString(2, employee[1]);
			statement.setString(3, employee[2]);
			statement.addBatch();
		}
		
		int[] rowsInserted = statement.executeBatch();
		System.out.println("Total rows inserted: "+rowsInserted.length);
		
		statement.close();
		
		connection.close();
	}
}
