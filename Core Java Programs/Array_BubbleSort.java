package com.method;

public class Array_BubbleSort
{
	public void sort(int[] arr)
	{
		for(int i=0;i<arr.length-1;i++)
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
		for(int k:arr)
		{
			System.out.println(k);
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {50,30,40,10,20};
		System.out.println("Array Before Sorting: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("Array After Bubble Sorting:");
		Array_BubbleSort b=new Array_BubbleSort();
		b.sort(arr);
	}
}
