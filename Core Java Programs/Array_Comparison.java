package com.method;

import java.util.Arrays;

public class Array_Comparison 
{
	public void compare(int[] arr1,int[] arr2)
	{
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		if(Arrays.equals(arr1, arr2))
		{
			System.out.println("Equal Arrays");
		}
		else
		{
			System.out.println("Not Equal Arrays");
		}
	}
	public static void main(String[] args) {
		int[] arr1=new int[] {2,4,6,8};
		int[] arr2= {8,4,2,6};
		Array_Comparison c=new Array_Comparison();
		c.compare(arr1,arr2);
	}
}
