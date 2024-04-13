package com.method;

import java.util.Scanner;

class Array_DuplicateElements 
{
	public void duplicate(int[] arr)
	{
		int[] duplicate = new int[arr.length];
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					duplicate[i]=arr[i];
					count=count+1;
				}
			}
		}
		System.out.println("Duplicate Elements in array are: ");
		for(int k=0;k<duplicate.length;k++)
		{
			if(duplicate[k]!=0)
			{
			System.out.print(duplicate[k]+" ");
			System.out.println();
			}
		}
		System.out.println("Total Duplicate elements: "+count);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit of array: ");
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt();
		int[] arr=new int[limit];
		System.out.println("Enter the elements in an array: ");
		for(int i=0;i<limit;i++)
			
		{
			arr[i]=scan.nextInt();
		}
		System.out.println("Elements in an array: ");
		for(int j=0;j<arr.length;j++)
		{
			System.out.print(arr[j]+" ");
			System.out.println();
		}
		Array_DuplicateElements a=new Array_DuplicateElements();
		a.duplicate(arr);
	}
}
