package com.method;

public class Array_Ascending 
{
	public void ascending(int[] arr)
	{
	
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
	}
	public static void main(String[] args)
	{
		int[] arr=new int[] {5,3,2,4,1};
		System.out.println("Original Array: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("Array in Ascending Order: ");
		Array_Ascending a=new Array_Ascending();
		a.ascending(arr);
	}
}
