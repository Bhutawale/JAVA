package com.method;

public class Array_AllNumbersDivisibleBy 
{
	public static void divisibleby2(int[] arr)
	{
		boolean flag=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				flag=false;
				break;
			}
		}
		if(flag==false)
		{
			System.out.println("All elements are not divisible by 2");
		}
		else
		{
			System.out.println("All elements are divisible by 2");
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {2,4,6,8,3};
		System.out.println("Original Array: ");
		for(int n:arr)
			System.out.println(n);
		divisibleby2(arr);
	}
}
