package com.method;

public class Array_SortColors 
{
	public static void main(String[] args)
	{
		int[] arr= {2,0,2,1,1,0};
		//o/p- [0,0,1,1,2,2]
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Colors in array: ");
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
		
	}
}
