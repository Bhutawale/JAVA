package com.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class ReverseArray 
{
	public static void main(String[] args) 
	{
		Integer[] arr= {1,2,3,4,5};
		List<Integer> list = Arrays.asList(arr);
		Collections.reverse(list);
		System.out.println(list);
		
		int[] arr1= {1,2,3,4,5};
		int[] revarr = IntStream.range(0, arr1.length).map(i->arr1[arr1.length-1-i]).toArray();
		System.out.println(Arrays.toString(revarr));
	
	}
}
