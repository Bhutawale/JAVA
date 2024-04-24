package com.KrishnaSandeep_Youtube_Programs;

public class MaxElementInArray 
{
	public static int max(int[] arr)
	{
		int max=arr[0];
		for(int i:arr)
			if(i>max)
				max=i;
		return max;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,4,50,2,3};
		int max = max(arr);
		System.out.println(max);
	}
}
