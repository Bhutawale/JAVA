package com.method;

import java.util.Scanner;

public class Array_CopyingElements
{
	private static void copyarray(int[] arr,int limit) 
	{
		int[] newarr=new int[limit];
		System.out.println("After copying the array elements in new array is: ");
		System.arraycopy(arr, 0, newarr, 0,limit );
		for(int k=0;k<=newarr.length-1;k++)
		{
			System.out.println(newarr[k]);
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the limit of an array: ");
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt();
		int[] arr=new int[limit];
		System.out.println("Enter elements into the array:");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Entered array is: ");
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.println(arr[j]);
		}
		copyarray(arr,limit);
	}
		
}

