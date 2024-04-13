package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class Emp_1_MainClass 
{
	public static void main(String[] args)
	{
		List<Emp_1> list = Arrays.asList
				(new Emp_1("satish", 25, 20000),
				new Emp_1("sachin", 35, 25000),
				new Emp_1("sagar", 45, 50000),
				new Emp_1("kiran", 24, 23000),
				new Emp_1("mangalam", 26, 26000));
		
		list.stream().map(e->{
			if(e.getAge()>25) {
				e.setSalary(e.getSalary()*1.10);
			}
			return e;
		}).forEach(System.out::println);
		
	
	}
}
