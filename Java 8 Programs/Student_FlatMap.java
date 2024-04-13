package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Student_FlatMap
{
	int id;
	String name;
	String city;
	
	Student_FlatMap (int id,String name,String city)
	{
		this.id=id;
		this.name=name;
		this.city=city;
	}
	
	public static void main(String[] args) 
	{
		List<Student_FlatMap> list1 = Arrays.asList(new Student_FlatMap(1, "Satish", "Karjat"),
				new Student_FlatMap(2, "Sanskar", "Panvel"),
				new Student_FlatMap(3, "Sanskruti", "Pune"));
		
		List<Student_FlatMap> list2 = Arrays.asList(new Student_FlatMap(4, "Bhagyashri", "Pune"),
				new Student_FlatMap(5, "Sachin", "London"));
		
		List<Student_FlatMap> list3 = Arrays.asList(new Student_FlatMap(6, "Suyog", "USA"),
				new Student_FlatMap(7, "Kittu", "Pune"));
		
		List<List<Student_FlatMap>> MainList = Arrays.asList(list1,list2,list3);
		
		List<String> collect = MainList.stream()
				.flatMap(s->s.stream())
				.map(stu->stu.name)
				.filter(stu->stu.startsWith("K"))
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
