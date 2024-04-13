package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElements 
{
	public static void main(String[] args) {
		
		List<Integer> list1 = Arrays.asList(1,2,3,4,5,6,7,8,9);
		
		List<Integer> list2 = Arrays.asList(10,2,3,4,5,6,66,88);
		
		List<Integer> collect = list1.stream()
				.filter(list2::contains)
				.collect(Collectors.toList());
		
		System.out.println(collect);
	}
}
