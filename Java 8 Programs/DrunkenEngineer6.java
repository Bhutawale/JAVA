package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class DrunkenEngineer6 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("Apple","Banana","Anjir","Chikoo","Amba");
		
		System.out.println("Strings starting with letter A: ");
		List<String> collect = list.stream().filter(s->s.startsWith("A")).collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
