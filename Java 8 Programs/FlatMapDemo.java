package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo  
{
	public static void main(String[] args) 
	{
		List<Integer> list1 = Arrays.asList(1,2,3);
		List<Integer> list2 = Arrays.asList(4,5,6);
		List<Integer> list3 = Arrays.asList(7,8,9);
		
		List<List<Integer>> list = Arrays.asList(list1,list2,list3);
		
		List<Integer> collect = list.stream()
				.flatMap(n->n.stream().map(c->c+10))
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
