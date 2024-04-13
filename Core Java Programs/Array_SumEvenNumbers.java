package com.method;

public class Array_SumEvenNumbers 
{
	public int sum(int[] arr)
	{
		int sum=0;
		for(int n:arr)
		{
			if(n%2==0)
			{
				sum=sum+n;
			}
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,4,5,6,7,8};
		Array_SumEvenNumbers e=new Array_SumEvenNumbers();
		int sum = e.sum(arr);
		System.out.println("Sum of Even Numbers: "+sum);
	}
}
