package com.Java_8_Programs;

import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FrequenecyOfEachCharacter 
{
	public static void main(String[] args) 
	{
		String str="Java is a wonderful language";
		
		Map<Character, Long> collect = str.chars().mapToObj(c->(char)c)
		.collect(Collectors.groupingBy
				(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
	}
}
