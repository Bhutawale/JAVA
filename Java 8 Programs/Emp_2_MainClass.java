package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Emp_2_MainClass 
{
	public static void main(String[] args) 
	{
		List<Emp_2> list = Arrays.asList(new Emp_2("satish", "pune"),
				new Emp_2("sagar", "nashik"),
				new Emp_2("sachin", "pune"),
				new Emp_2("sattu", "nashik"),
				new Emp_2("kiran", "mumbai"));
		
		Map<String, List<Emp_2>> collect = list.stream()
		.collect(Collectors.groupingBy(Emp_2::getCity));
		
		System.out.println(collect);
		
				
	}
}
