package com.KrishnaSandeep_Youtube_Programs;

import java.util.HashMap;
import java.util.Map;

public class MaxCountInArray 
{
	public static void maxCount(int[] arr)
	{
		HashMap<Integer,Integer> map=new HashMap<>();
		
		for(int i:arr)
		{
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		
		int maxCount = 0;
        int maxNumber = 0;
        
        for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int number = entry.getKey();
            int count = entry.getValue();
            
            if(count > maxCount) 
            {
                maxCount = count;
                maxNumber = number;
            }
        }
        System.out.println(maxNumber);
		
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,3,4,4,5,5,5,6,7};
		maxCount(arr);
	}
}
