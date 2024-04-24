package com.KrishnaSandeep_Youtube_Programs;

import java.util.ArrayList;
import java.util.List;

public class ElementsInEvenPosition 
{
	public static List<Integer> evenPositionElements(int[] arr)
	{
		List<Integer> list=new ArrayList<Integer>();
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				list.add(arr[i]);
			}
		}
		return list;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5};
		List<Integer> elements = evenPositionElements(arr);
		elements.stream().forEach(System.out::println);
	}
}
