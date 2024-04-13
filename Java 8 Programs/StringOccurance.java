package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StringOccurance
{
	public static void main(String[] args) 
	{
		String str="welcome to code decode and code decode welcome you";
		
		String[] split = str.split(" ");
		
		List<String> list = Arrays.asList(split);
		
		Map<String, Long> collect = 
				list.stream()
				.collect(Collectors.groupingBy
						(Function.identity(),Collectors.counting()));
		
		System.out.println(collect);
	}
}
