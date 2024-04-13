package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class Average 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		Double avg = list.stream().collect(Collectors.averagingInt(n->n));
		
		System.out.println(avg);
		
		OptionalDouble average = list.stream().mapToInt(n->n).average();
		
		System.out.println(average.getAsDouble());
	}
}
