package com.method;

public class Array_EvenOddPosition 
{
	public void evenposition(int[] arr)
	{
		System.out.println("Even Position Elements in array are: ");
		for(int i=0;i<arr.length;i+=2)
		{
			System.out.println(arr[i]);
		}
	}
	public void oddposition(int[] arr)
	{
		System.out.println("Odd Position Elements in array are: ");
		for(int j=1;j<arr.length;j+=2)
		{
			System.out.println(arr[j]);
		}
	}
	public static void main(String[] args) 
	{
		int[] arr=new int[] {1,2,3,4,5,6};
		Array_EvenOddPosition e=new Array_EvenOddPosition();
		e.evenposition(arr);
		Array_EvenOddPosition o=new Array_EvenOddPosition();
		o.oddposition(arr);
	}
}
