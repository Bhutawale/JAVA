package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Professor_MainClass 
{
	public static void main(String[] args) 
	{
		List<Professor> list = Arrays.asList(
		new Professor(1, "satish", 35, "male", "mca", "karjat", 1,
						Arrays.asList("1234567890","9011150573")),
		new Professor(5, "sagar", 33, "male", "mba", "kalyan", 3,
				Arrays.asList("1234567890","9011150573")),
		new Professor(2, "sanskruti", 30, "female", "mca", "pune", 12,
				Arrays.asList("1234567890","9011150573")),
		new Professor(3, "bhagu", 31, "female", "mca", "dadar", 5,
				Arrays.asList("1234567890","9011150573")),
		new Professor(4, "nitin", 37, "male", "engineering", "dadar", 9,
				Arrays.asList("1234567890","9011150573")),
		new Professor(7, "girish", 38, "male", "engineering", "dadar", 8,
				Arrays.asList("1234567890","9011150573")));
		
		
		System.out.println("Find professor having rank between 10-20");
		
		List<Professor> rank = list
				.stream()
				.filter(prof->prof.getRank()>10 && prof.getRank()<20)
				.collect(Collectors.toList());
		
		System.out.println(rank);
		
		System.out.println("------------------");
		
		System.out.println("Find professor who stay in dadar and sort them by their names: ");
		
		List<Professor> City_SortedName = list.stream()
		.filter(prof->prof.getCity().equals("dadar"))
		.sorted(Comparator.comparing(Professor::getFirstname,Comparator.reverseOrder()))
		.collect(Collectors.toList());
		
		System.out.println(City_SortedName);
		
		System.out.println("-------------------");
		
		System.out.println("Get Departments Name: ");
		
		list
		.stream()
		.map(prof->prof.getDepartment())
		.distinct()
		.forEach(System.out::println);
		
		System.out.println("-------------------");
		
		System.out.println("Find all the contact numbers: ");
		
		list.stream().map(Professor::getContacts).forEach(System.out::println);
		System.out.println("--------------------");
		list.stream().flatMap(prof->prof.getContacts().stream()).forEach(System.out::println);
		System.out.println("-------------------");
		
		System.out.println("Group Professors by department names");
		
		Map<String, Long> group_count = list.stream()
				.collect(Collectors.groupingBy(Professor::getDepartment,Collectors.counting()));
		
		System.out.println(group_count);
		
		System.out.println("-------------------");
		
		Map<String, List<Professor>> group_prof
				= list.stream().collect(Collectors.groupingBy(Professor::getDepartment));
		
		Iterator<Entry<String, List<Professor>>> itr = group_prof.entrySet().iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("-------------------");
		
		System.out.println("Display department with max professor: ");
		
		Optional<Entry<String, Long>> Max_Prof = list.stream().collect(Collectors.groupingBy(Professor::getDepartment,Collectors.counting()))
		.entrySet().stream().collect(Collectors.maxBy(Map.Entry.comparingByValue()));
		
		System.out.println(Max_Prof);
		
		System.out.println("--------------------");
		
		System.out.println("Find average age of male and female professors: ");
		
		Map<String, Double> avg_age = list
				.stream()
				.collect(Collectors.groupingBy(Professor::getGender,
						Collectors.averagingDouble(Professor::getAge)));
		
		System.out.println(avg_age);
		
		System.out.println("---------------------");
		
		System.out.println("Find highest rank in each department: ");
		
		Map<String, Optional<Professor>> rank_dept = list
				.stream()
				.collect(Collectors.groupingBy(Professor::getDepartment,
						Collectors.minBy(Comparator.comparing(Professor::getRank))));
		
		Iterator<Entry<String, Optional<Professor>>> itr1 = rank_dept.entrySet().iterator();
		
		while(itr1.hasNext())
			System.out.println(itr1.next());
		
		System.out.println("---------------------");
		
		System.out.println("Find professor having rank 2: ");
		
		Professor professor = list.stream().sorted(Comparator.comparing(Professor::getRank)).skip(1).findFirst().get();
		
		System.out.println(professor);
		
		
		

		
		
	
		
	}
}
