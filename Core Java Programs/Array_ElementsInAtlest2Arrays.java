package com.method;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class Array_ElementsInAtlest2Arrays 
{
	public static void main(String[] args) 
	{
		Integer[] arr1= {1,2,3,9,8,7};
		Integer[] arr2= {4,1,2,10,15};
		Integer[] arr3= {5,1,2,4,10};
		
		List<Integer> l1 = Arrays.asList(arr1);
		List<Integer> l2 = Arrays.asList(arr2);
		List<Integer> l3 = Arrays.asList(arr3);
		
		Set<Integer> set=new HashSet<Integer>();
		
		set.addAll(l1);
		set.addAll(l2);
		set.addAll(l3);
		
		System.out.println("Unique Elements: "+set);
		
		List<Integer> list=new ArrayList<Integer>();
		
		for(Integer n:set)
		{
			if(l1.contains(n) && l2.contains(n) ||
					l2.contains(n) && l3.contains(n) ||
					l3.contains(n) && l1.contains(n))
			{
				list.add(n);
			}
		}
		
		System.out.println("Repeated Numbers in either of three arrays: ");
		
		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}
}
