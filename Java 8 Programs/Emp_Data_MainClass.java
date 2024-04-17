package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp_Data_MainClass
{
	public static void main(String[] args) 
	{
		List<Emp_Data> list = Arrays.asList(
				new Emp_Data(23, "Abc", 25000, "hr", "male", 2015),
				new Emp_Data(27, "xyz", 35000, "tech", "female", 2014),
				new Emp_Data(43, "pqr", 55000, "hr", "female", 2012),
				new Emp_Data(53, "sdf", 45000, "ops", "male", 2016));
		
		
		System.out.println("Highest paid Employee: ");
		
		Emp_Data sal_highest_emp = list.stream()
		.collect(Collectors.maxBy
				(Comparator.comparing(Emp_Data::getSalary)))
		.get();
		
		System.out.println(sal_highest_emp);
		
		System.out.println("-----------------");
		
		System.out.println("Employee joined after 2014: ");
		
		List<Emp_Data> emp_after_2014 = list
				.stream()
				.filter(e->e.getJoining()>2014)
				.collect(Collectors.toList());
		
		for(Emp_Data e:emp_after_2014)
			System.out.println(e);
		
		System.out.println("-----------------");
		
		System.out.println("Group by gender: ");
		
		Map<String, Long> collect = list
				.stream()
				.collect(Collectors.groupingBy
						(Emp_Data::getGender,
								Collectors.counting()));
		
		System.out.println(collect);
		
		System.out.println("---------------");
		
		System.out.println("Group By Department: ");
		
		Map<String, Long> collect2 = list.stream().collect(Collectors.groupingBy(Emp_Data::getDept,Collectors.counting()));
		
		System.out.println(collect2);
		
		System.out.println("----------------");
		
		System.out.println("Average age of females and males: ");
		
		Map<String, Double> collect3 = list.stream().collect(Collectors.groupingBy(Emp_Data::getGender,Collectors.averagingDouble(Emp_Data::getAge)));
		
		System.out.println(collect3);
	}
}
