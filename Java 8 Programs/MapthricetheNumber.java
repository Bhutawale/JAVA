package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MapthricetheNumber 
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		List<Integer> collect = list.stream().map(n->n*3).collect(Collectors.toList());
		System.out.println(collect);
	}
}
