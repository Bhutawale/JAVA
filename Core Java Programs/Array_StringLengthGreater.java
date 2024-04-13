package com.method;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Array_StringLengthGreater
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("satish","ram","raju","sanskar");
		List<String> collect = list.stream().filter(s->s.length()>5).collect(Collectors.toList());
		
		System.out.println(collect);
		
	}
}
