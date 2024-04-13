package com.method;

public class Array_DoubleElements
{
	public void doubledigit(int[] arr)
	{
		int[] newarr=new int[arr.length];
		int doubledig=0;
		for(int i=0;i<arr.length;i++)
		{
			doubledig=arr[i]*2;
			newarr[i]=doubledig;
		}
		System.out.println("New array");
		for(int n:newarr)
		{
			System.out.print(n+" ");
		}

	}
	public static void main(String[] args) 
	{
		int[] arr=new int[] {1,2,3,4,5};
		System.out.println("Original Array");
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
		Array_DoubleElements d=new Array_DoubleElements();
		d.doubledigit(arr);
	}
}
