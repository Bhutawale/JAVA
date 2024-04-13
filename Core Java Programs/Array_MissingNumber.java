package com.method;

public class Array_MissingNumber //finding single missing number.
{
	public static void main(String[] args) 
	{
		int[] original_Array=new int[] {1,2,3,4,5};
		
		int[] new_Array=new int[] {1,2,3,5};
		int sum=0;
		int new_sum=0;
		System.out.println("Original Array");
		for(int i:original_Array)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("New Array");
		for(int i:new_Array)
		{
			System.out.print(i+" ");
		}
		for(int k=0;k<original_Array.length;k++)
		{
			sum=sum+original_Array[k];
		}
		for(int i=0;i<new_Array.length;i++)
		{
			new_sum=new_sum+new_Array[i];
		}
		System.out.println();
		System.out.println("Missing Element in array is: "+ (sum-new_sum));
	}
}
