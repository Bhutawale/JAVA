package com.DesignPattern.FactoryDesignPattern;

public class EmpMain 
{
	public static void main(String[] args) 
	{
		Emp emp1 = EmpFactory.getEmp("IT");
		System.out.println(emp1.getDepartment());
		
		Emp emp2 = EmpFactory.getEmp("Finance");
		System.out.println(emp2.getDepartment());
	}
}
