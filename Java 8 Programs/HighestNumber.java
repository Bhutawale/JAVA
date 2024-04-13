package com.Java_8_Programs;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class HighestNumber 	
{
	public static void main(String[] args) 
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5,6);
		
		Integer max = list.stream().max(Comparator.comparingInt(n->n)).get();
		
		System.out.println(max);
	}
}
