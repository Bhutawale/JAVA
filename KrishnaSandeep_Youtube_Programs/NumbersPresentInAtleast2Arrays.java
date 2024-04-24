package com.KrishnaSandeep_Youtube_Programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class NumbersPresentInAtleast2Arrays 
{
	public static void main(String[] args) 
	{
		Integer[] arr1= {1,2,3,4,5};
		Integer[] arr2= {2,3,6,7,8};
		Integer[] arr3= {6,4,1,9,10};
		
		Set<Integer> set=new HashSet<>();
		
		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		List<Integer> l3 = Arrays.asList(arr3);
		
		set.addAll(l1);
		set.addAll(l2);
		set.addAll(l3);
		
		for(Integer num:set)
		{
			if((l1.contains(num)&& l2.contains(num)) ||
				(l2.contains(num) && l3.contains(num)) ||
				(l3.contains(num) && l1.contains(num)))
			{
				System.out.println(num);
			}
		}
	}
}
