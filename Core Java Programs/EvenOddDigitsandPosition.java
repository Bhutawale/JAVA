package com.method;

public class EvenOddDigitsandPosition
{
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8};
		
		System.out.println("Even Numbers in given array: ");
		System.out.println("Even Number      Position");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]+"                   "+ i);
			}
		}
		System.out.println("Odd Numbers in given array: ");
		System.out.println("Odd Number      Position");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println(arr[i]+"                   "+ i);
			}
		}
	}
}
