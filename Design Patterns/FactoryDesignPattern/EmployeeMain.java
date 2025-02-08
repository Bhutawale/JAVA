package com.DesignPattern.FactoryDesignPattern;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee employee = EmployeeFactory.getEmployee("Web Developer");
		System.out.println(employee.salary());
		
		Employee employee1 = EmployeeFactory.getEmployee("Android Developer");
		System.out.println(employee1.salary());
	}
}
