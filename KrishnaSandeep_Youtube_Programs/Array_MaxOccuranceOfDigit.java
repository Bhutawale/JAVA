package com.programs;

import java.util.HashMap;
import java.util.Map;

public class Array_MaxOccuranceOfDigit 
{
	static int maxOccurance(int[] arr)
	{
		Map<Integer, Integer> map=new HashMap<Integer, Integer>();
		int maxKey=-1,maxCount=0;
		for(int n:arr)
		{
			map.put(n, map.getOrDefault(n, 0)+1);
		}
		for(Map.Entry<Integer, Integer> entry:map.entrySet())
		{
			System.out.println(entry.getKey()+":"+entry.getValue());
			if(entry.getValue()>maxCount)
			{
				maxCount=entry.getValue();
				maxKey=entry.getKey();
			}
		}
		return maxKey;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,2,3,2,4,5,2,3,2,2,6,7,3,3,3,3};
		int maxOccurance = maxOccurance(arr);
		System.out.println("Digit with maximum Occurance: " +maxOccurance);
	}
}
