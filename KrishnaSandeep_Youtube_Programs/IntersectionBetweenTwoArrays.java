package com.KrishnaSandeep_Youtube_Programs;

public class IntersectionBetweenTwoArrays
{
	public static int[] intersection(int[] arr1,int[] arr2)
	{
		int[] common=new int[arr1.length];
		int index=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					common[index]=arr1[i];
					index++;
				}
			}
		}
		
		return common;
	}
	public static void main(String[] args) 
	{
		int[] arr1= {1,2,4,5,3};
		int[] arr2= {5,3,6,7,8};
		int[] intersection = intersection(arr1,arr2);
		for(int n:intersection)
			if(n!=0)
			System.out.println(n);
 	}
}
