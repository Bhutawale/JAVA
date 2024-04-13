package com.method;

import java.util.Scanner;

public class MaxMinInArray 
{
	public static void findmaxandmin(int arr[])
	{
		int max=arr[0],min=arr[0];
		for(int k=0;k<=arr.length-1;k++)
		{
			if(arr[k]>max)
			{
				max=arr[k];
			}
		}
		System.out.println("The Maximum value in the given array is: "+max);
		
		for(int l=0;l<=arr.length-1;l++)
		{
			if(arr[l]<min)
			{
				min=arr[l];
			}
		}
		System.out.println("The minimum value in the given array is: "+min);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the array Limit: ");
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt();
		int[] arr=new int[limit];
 		System.out.println("Enter the elemnts into the Array: ");
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Array is: ");
		for(int j=0;j<=arr.length-1;j++)
		{
			System.out.println(arr[j]);
		}
		
		findmaxandmin(arr);
	}
}
