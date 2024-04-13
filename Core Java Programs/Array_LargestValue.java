package com.method;


public class Array_LargestValue
{
	public static void largest(int[] arr)
	{
		int max=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				max = Math.max(arr[i],arr[j]);
			}
		}
		System.out.println("Maximim Value using Math Function: "+max);
		
	}
	public static void main(String[] args) {
		int[] arr= {12,23,4,56,78,90,91,100};
		largest(arr);
	}
}
