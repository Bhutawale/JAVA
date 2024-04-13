package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class Array_StringLengthGreater
{
	public static void main(String[] args) 
	{
		List<String> list = Arrays.asList("satish","ram","raju","sanskar");
		long count = list.stream().filter(s->s.length()>5).count();
		System.out.println(count);
		
	}
}
