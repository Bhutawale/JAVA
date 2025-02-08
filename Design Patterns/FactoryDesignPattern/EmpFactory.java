package com.DesignPattern.FactoryDesignPattern;

public class EmpFactory 
{
	public static Emp getEmp(String department)
	{
		if(department.trim().equalsIgnoreCase("IT"))
		{
			return new IT_Dept();
		}
		else if(department.trim().equalsIgnoreCase("Finance"))
		{
			return new Finance_Dept();
		}
		else
			return null;
	}
}
