package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Even_Odd 
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(21,22,34,64,2,43,76,46,89,90,91);
		
		Map<Boolean, List<Integer>> collect = 
				list.stream()
				.collect(Collectors.partitioningBy(n->n%2==0));
		
		System.out.println("Even Numbers: "+collect.get(true));
		
		System.out.println("Odd Numbers: "+collect.get(false));
	}
}
