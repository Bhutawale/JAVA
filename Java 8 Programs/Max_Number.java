package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;

public class Max_Number
{
	public static void main(String[] args)
	{
		List<Integer> list = Arrays.asList(1,2,3,4,5);
		
		int max = list.stream().mapToInt(n->n).max().getAsInt();
		
		Integer max_num = list.stream().max((i,j)->i.compareTo(j)).get();
		
		System.out.println(max);
		
		System.out.println(max_num);
	}
}
