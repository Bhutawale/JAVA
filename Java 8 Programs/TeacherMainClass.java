package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class TeacherMainClass 
{
	public static void main(String[] args) 
	{
		List<Teacher> list = Arrays.asList(
		new Teacher(1, "satish", "karjat", 25),
		new Teacher(3, "amol", "kalyan", 28),
		new Teacher(5, "amit", "badlapur", 35),
		new Teacher(2, "kiran", "panvel", 20),
		new Teacher(4, "sanskar", "pune", 45));
		
		List<Teacher> collect = list.stream().filter(t->t.age>25).collect(Collectors.toList());
		
		Iterator<Teacher> itr = collect.iterator();
		
		while(itr.hasNext())
			System.out.println(itr.next());
		
		System.out.println("------------");
		System.out.println("City starting with letter p ");
		list.stream().filter(t->t.city.startsWith("p")).forEach(System.out::println);
		
		System.out.println("------------");
		
		Double avg = list.stream().collect(Collectors.averagingInt(Teacher::getAge));
		
		System.out.println(avg);
		
		System.out.println("-------------");
		
		Integer sum = list.stream().collect(Collectors.summingInt(Teacher::getAge));
		
		System.out.println(sum);
		
		System.out.println("--------------");
		
		list.sort(Comparator.comparing(Teacher::getAge));
		
		Iterator<Teacher> iterator = list.iterator();
		
		while(iterator.hasNext())
			System.out.println(iterator.next());
		
		System.out.println("---------------");
		
		
	}
}
