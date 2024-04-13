package com.method;

public class Array_EvenOddSort
{
	public void sort(int[] arr)
	{
		int [] newarr=new int[arr.length];
		int index=0;
		//for even numbers
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				newarr[index]=arr[i];
				index++;
			}
		}
		//for odd numbers
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				newarr[index]=arr[i];
				index++;
			}
		}
		//displaying new array
		for(int i=0;i<newarr.length;i++)
		{
			System.out.print(newarr[i]+" ");
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		Array_EvenOddSort s=new Array_EvenOddSort();
		s.sort(arr);
	}
}
