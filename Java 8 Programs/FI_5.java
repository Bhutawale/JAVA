package com.Java_8_Programs;

import java.util.Scanner;

interface inter5
{
	public void max(int num);
}
public class FI_5 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit of array: ");
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt();
		int[] arr=new int[limit];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the elements into the array: ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.println("Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		scan.close();
		s.close();
		
		
		inter5 i=(no)-> 
				     	{
				     		int max=arr[0];
				     		for(int m=0;m<arr.length;m++)
				     		{
				     			if(arr[m]>max)
				     			{
				     				max=arr[m];
				     			}
				     		}
				     		System.out.println("Maximum value: "+max);
				     			
				     	};
				     	i.max(limit);
	}
}
