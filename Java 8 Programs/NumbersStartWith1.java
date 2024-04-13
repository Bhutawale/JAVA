package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NumbersStartWith1 	
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,11,21,12,111,43,121);
		
		List<Integer> collect = list.stream()
				.filter(n->n.toString()
				.startsWith("1"))
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
