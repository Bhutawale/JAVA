package com.method;

public class Array_Reverse 
{
	public void reverse(int[] arr)
	{
		System.out.println("The reverse of given array is: ");
		for(int j=arr.length-1;j>=0;j--)
		{
			System.out.print(arr[j]+" ");
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
		Array_Reverse r=new Array_Reverse();
		r.reverse(arr);
	}
}
