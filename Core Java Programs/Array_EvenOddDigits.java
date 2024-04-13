package com.method;

public class Array_EvenOddDigits
{
	public void even(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				System.out.println(arr[i]);
			}
		}
	}
	public void odd(int[] arr)
	{
		for(int j:arr)
		{
			if(j%2!=0)
			{
				System.out.println(j);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5};
		Array_EvenOddDigits e=new Array_EvenOddDigits();
		System.out.println("Even numbers in array: ");
		e.even(arr);
		System.out.println("Odd Numbers in Array: ");
		e.odd(arr);
	}
}
