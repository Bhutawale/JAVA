package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MaxMinNumbers 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,100);
		
		Integer max = list.stream()
				.max(Comparator.naturalOrder()).get();
		
		System.out.println("Maximum Number: "+max);
		
		System.out.println("------------");
		
		List<Integer> first_3_min = list.stream().sorted().limit(3).collect(Collectors.toList());
		
		System.out.println("First 3 minimum numbers: "+first_3_min);
		
		List<Integer> first_3_max = list.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
		
		System.out.println("First 3 Maximum numbers: "+first_3_max);
		
		Integer min = list.stream()
				.min(Comparator.naturalOrder()).get();
		
		System.out.println("Minimum Number: "+min);
		
		System.out.println("-----------");
		
		Integer second_largest = list.stream()
				.sorted(Comparator.reverseOrder())
				.skip(1).findFirst().get();
		
		System.out.println(second_largest);
		
		
		
	}
}
