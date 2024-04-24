package com.KrishnaSandeep_Youtube_Programs;

import java.util.Scanner;

public class SortingStringsInArray 
{
	public static String[] sort(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareToIgnoreCase(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		return arr;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit of an array: ");
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		String[] arr=new String[n];
		System.out.println("Enter the elements into the array: ");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextLine();
		}
		String[] sort = sort(arr);
		for(String s:sort)
			System.out.println(s);
		sc.close();
		scan.close();
	}
}
