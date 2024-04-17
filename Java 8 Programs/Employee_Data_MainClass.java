package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Employee_Data_MainClass 
{
	public static void main(String[] args) 
	{
		List<Employee_Data> list = Arrays.asList(
				new Employee_Data(1, 100000),
				new Employee_Data(4, 50000),
				new Employee_Data(2, 10000),
				new Employee_Data(3, 40000),
				new Employee_Data(5, 20000));
		
		System.out.println("Employee Salary in Descending Order: ");
		
		List<Employee_Data> sal_rev = list.stream()
		.sorted(Comparator.comparing
				(Employee_Data::getSalary,
						Comparator.reverseOrder()))
		.collect(Collectors.toList());
		
		for(Employee_Data e:sal_rev)
			System.out.println(e);
	
		System.out.println("--------------------");
		
		System.out.println("Fetching top 3 salaried Employee: ");
		
		List<Employee_Data> top_3 = sal_rev.subList(0, 3).stream().collect(Collectors.toList());
		
		for(Employee_Data e:top_3)
			System.out.println(e);
		
		System.out.println("--------------------");
		
		System.out.println("Salary less then 3rd highest employees: ");
		
		List<Employee_Data> collect = sal_rev.subList(3, 5).stream().collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
