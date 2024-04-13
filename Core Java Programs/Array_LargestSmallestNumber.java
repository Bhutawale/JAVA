package com.method;

public class Array_LargestSmallestNumber 
{
	public static void main(String[] args)
	{
		int[] arr= {10,30,100,5,40};
		int min=arr[0];
		int max=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min=arr[i];
			}
			else if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		System.out.println(min);
		System.out.println(max);
	}
}
