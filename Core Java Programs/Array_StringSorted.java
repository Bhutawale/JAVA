package com.method;

public class Array_StringSorted
{
	public void sorting(String[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].compareTo(arr[j])>0)
				{
					String temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted String Array: ");
		for(String s:arr)
			System.out.println(s);
	}
	public static void main(String[] args)
	{
		String[] arr=new String[] {"banana","apple","cherry","anjir"};
		Array_StringSorted sort=new Array_StringSorted();
		sort.sorting(arr);
	}
}
