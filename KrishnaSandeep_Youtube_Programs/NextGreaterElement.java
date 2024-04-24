package com.KrishnaSandeep_Youtube_Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class NextGreaterElement 
{
	public static Map<Integer, Integer> nextGreaterElement(int[] arr)
	{
		Map<Integer,Integer> map=new LinkedHashMap<Integer, Integer>();
		int next;
		for(int i=0;i<arr.length;i++)
		{
			next=-1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					next=arr[j];
					break;
				}
			}
			map.put(arr[i], next);
		}
		
		return map;
	}
	public static void main(String[] args) 
	{
		int arr[] = {10,11,5,4,7};
		Map<Integer, Integer> nextGreaterElement = nextGreaterElement(arr);
		nextGreaterElement.entrySet().forEach(System.out::println);
	}
}
