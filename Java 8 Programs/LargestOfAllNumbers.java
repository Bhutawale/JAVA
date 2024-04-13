package com.Java_8_Programs;

import java.util.Arrays;
import java.util.List;


public class LargestOfAllNumbers 
{
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
		Integer max = list.stream().max((i,j)->i.compareTo(j)).get();
		System.out.println(max);
	}
}
