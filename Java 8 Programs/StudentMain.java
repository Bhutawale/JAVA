package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StudentMain 
{
	public static void main(String[] args) 
	{
		List<Student> list = Arrays.asList(
				new Student(1, "satish", "karjat"),
				new Student(2, "sagar", "kalyan"),
				new Student(3, "kiran", "badlapur"),
				new Student(4, "sanskar", "thane"),
				new Student(5, "sanskruti", "karjat"));
		
		Map<String, List<Student>> collect = list.stream().collect(Collectors.groupingBy(Student::getCity));
		
		collect.forEach((k,v)->System.out.println("city: "+k +" "+"Student: "+ v));
	}
}
