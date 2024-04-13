package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoinElements 
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("apple","banana","cherry","date","grape");
		
		String collect = list.stream().collect(Collectors.joining("/"));
		
		System.out.println(collect);
	}
}
