package com.DesignPattern.AbstractFactoryDesignPattern;

public class EmployeeMain 
{
	public static void main(String[] args) 
	{
		Employee emp1 = EmployeeFactory.getEmployee(new AndroidDevFac());
		System.out.println(emp1.empName());
		
		Employee emp2 = EmployeeFactory.getEmployee(new WebDevFac());
		System.out.println(emp2.empSalary());
	}
}
