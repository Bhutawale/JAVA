package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DrunkenEngineer2 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("amol","amit","amol","vijay","satish","vijay");
		
		Stream<String> stream = list.stream();
		
		stream.forEach(System.out::println);
		
		List<String> collect = stream.filter(s->s.equals("amit")).collect(Collectors.toList());
		System.out.println(collect);
		
		//We cannot reuse the stream more than once.
		//will throw run time exception, illegalStateException.
	}
}
