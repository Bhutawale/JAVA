package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Duplicate_Strings 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Java","C","Hibernate","Java","C","CPP");
		
		List<String> collect = list.stream()
				.distinct()
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
