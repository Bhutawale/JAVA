package com.method;

public class Array_CommonElements 
{
	public void common(int[] arr1,int[] arr2)
	{
		int[] common=new int[arr2.length];
		int index=0;
		
		for(int i:arr1)
		{
			for(int j:arr2)
			{
				if(i==j)
				{
					common[index]=i;
					index++;
				}
			}
		}
		System.out.println();
		System.out.println("Common Elements in both the Arrays: ");
		for(int k:common)
		{
			if(k!=0)
			{
				System.out.print(k+" ");
			}
		}
	}
	public static void main(String[] args)
	{
		int[] arr1=new int[] {10,20,30,40,50};
		int[] arr2=new int[] {20,30,70,80,40,100,50};
		System.out.println("Array 1: ");
		for(int n:arr1)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("Array 2: ");
		for(int m:arr2)
		{
			System.out.print(m+" ");
		}
		Array_CommonElements c=new Array_CommonElements();
		c.common(arr1,arr2);
	}
}
