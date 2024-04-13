package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class String_StartWithNumber 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("One","2two","3hree","four","5ive");
		
		List<String> collect = list.stream().
				filter(s->Character.isDigit(s.charAt(0)))
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
