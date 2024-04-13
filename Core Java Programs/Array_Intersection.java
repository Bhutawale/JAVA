package com.method;

public class Array_Intersection 
{
	public void intersection(int[] arr1,int[] arr2)
	{
		int maxsize=Math.min(arr1.length, arr2.length);
		int[] arr = new int[maxsize];
		int index=0;
		for(int i=0;i<arr1.length;i++)
		{
			for(int j=0;j<arr2.length;j++)
			{
				if(arr1[i]==arr2[j])
				{
					arr[index]=arr1[i];
					index++;
				}	
			}
		}
		for(int n:arr)   //for printing array.
		{
			if(n!=0)
			{
				System.out.println(n);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr1=new int[] {1,2,3,4};
		int[] arr2=new int[] {1,3,5,4};
		
		Array_Intersection i=new Array_Intersection();
		i.intersection(arr1,arr2);
	}
}
