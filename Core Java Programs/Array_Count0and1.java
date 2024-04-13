package com.method;

public class Array_Count0and1 
{
	public void count(int[] arr)
	{
		int count_1=0;
		int count_0=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==1)
				count_1++;
			else
				count_0++;
		}
		System.out.println("Number of 1: "+count_1);
		System.out.println("Number of 0: "+count_0);
	}
	public static void main(String[] args) {
		int[] arr=new int[] {1,0,1,0,0,0,1,1,0};
		System.out.println("Orginal Array: ");
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		Array_Count0and1 c=new Array_Count0and1();
		c.count(arr);
	}
}
