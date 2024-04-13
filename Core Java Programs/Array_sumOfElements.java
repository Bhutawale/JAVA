package com.method;

public class Array_sumOfElements
{
	public int sumofelements(int[] arr)
	{
		int sum=0;
		for(int i=0;i<arr.length;i++)
		{
			sum=sum+arr[i];
		}
		return sum;
	}
	public static void main(String[] args)
	{
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9,10};
		Array_sumOfElements s=new Array_sumOfElements();
		int sumofelements = s.sumofelements(arr);
		System.out.println("The total sum of elements are: "+sumofelements);
	}
}
