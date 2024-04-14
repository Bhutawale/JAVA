package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Staff_MainClass 
{
	public static void main(String[] args) 
	{
		List<Staff> list = Arrays.asList(
				new Staff(1, "satish", 35, "active", "developer", 2013, 50000),
				new Staff(3, "sagar", 34, "active", "developer", 2016, 60000),
				new Staff(4, "vicky", 30, "inactive", "tester", 2019, 70000),
				new Staff(2, "suyog", 32, "active", "tester", 2021, 30000),
				new Staff(5, "sanskar", 32, "inactive", "hr", 2013, 40000));
		
		System.out.println("MAX and MIN Salary: ");
		
		Optional<Staff> max = list.stream()
				.max((a,b)->Double.compare
						(a.salary, b.salary));
		System.out.println(max);
		
		System.out.println("--------------");
		OptionalDouble max2 = list
				.stream()
				.mapToDouble(s->s.salary).max();
		
		System.out.println(max2);
		System.out.println("---------------");
		
		OptionalDouble min = list.stream()
				.mapToDouble(s->s.salary).min();
		System.out.println(min);
		
		System.out.println("---------------");
		
		Optional<Staff> min2 = list.stream()
				.min((a,b)->Double
						.compare
						(a.getSalary(), b.getSalary()));
		
		System.out.println(min2);
		System.out.println("---------------");
		
		Optional<Staff> collect = list.
				stream()
				.collect(Collectors.maxBy
						(Comparator.comparing
								(Staff::getSalary)));
		System.out.println(collect);
		
		System.out.println("---------------");
		
		Optional<Staff> collect2 = list.
				stream()
				.collect(Collectors.minBy
						(Comparator.
								comparingDouble
								(Staff::getSalary)));
		
		System.out.println(collect2);
		
		System.out.println("*****************");
		
		System.out.println("Printing Max salary of developer department: ");
		
		Optional<Staff> collect3 = list.stream().filter(s->s.getDepartment().equals("developer")).collect(Collectors.maxBy(Comparator.comparing(Staff::getSalary)));
		System.out.println(collect3);
		
		System.out.println("----------------");

		System.out.println("Printing Max Salary from each Departement: ");
		Map<String, Optional<Staff>> collect4 = list.stream()
				.collect(Collectors.groupingBy(Staff::getDepartment
						,Collectors.maxBy(Comparator.comparingDouble(Staff::getSalary))));
		
		Iterator<Entry<String, Optional<Staff>>> iterator = collect4.entrySet().iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("-------------------------");
		
		System.out.println("Printing Active and Inactive staff: ");
		
		Map<String, Long> collect5 = list.stream().
				collect(Collectors.groupingBy(Staff::getActive,Collectors.counting()));
		
		System.out.println(collect5);
		
		System.out.println("--------------------------");
		
		System.out.println("Staff working in each department: ");
		
		Map<String, Long> collect6 = list.stream().collect(Collectors.groupingBy(Staff::getDepartment,Collectors.counting()));
		
		System.out.println(collect6);
		
		System.out.println("--------------------------");
		
		System.out.println("Staff details working in each department: ");
		Map<String, List<Staff>> collect7 = list.stream().collect(Collectors.groupingBy(Staff::getDepartment));
		
		Iterator<Entry<String, List<Staff>>> itr = collect7.entrySet().iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
	}
}
