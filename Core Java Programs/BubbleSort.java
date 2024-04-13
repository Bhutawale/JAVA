package com.method;

public class BubbleSort
{
	public static void main(String[] args) {
		int[] arr= {10,40,20,30,50};
		
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
		System.out.println("Sorted Order: ");
		for(int k:arr)
		{
			System.out.println(k);
		}
	}
}
