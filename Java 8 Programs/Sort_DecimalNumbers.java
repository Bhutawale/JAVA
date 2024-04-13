package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Sort_DecimalNumbers 
{
	public static void main(String[] args)
	{	
		List<Double> list = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
		
		List<Double> collect = list.stream()
				.sorted(Comparator.reverseOrder())
				.collect(Collectors.toList());
		
		System.out.println(collect);
		
		System.out.println("-------------");
		
		List<Double> collect2 = list.stream().sorted().collect(Collectors.toList());
		
		System.out.println(collect2);
	}
}
