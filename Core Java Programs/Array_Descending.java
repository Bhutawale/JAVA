package com.method;

public class Array_Descending
{
	public void descending(int[] arr)
	{
		int temp=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Array in Descending Order: ");
		for(int i:arr)
		{
			System.out.print(i+" ");
		}
	}
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,4,5};
		System.out.println("Original Array: ");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]+ " ");
		}
		System.out.println();
		Array_Descending d=new Array_Descending();
		d.descending(arr);
	}
}
