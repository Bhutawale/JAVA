package com.method;

public class NumbersDivisibleBy2 
{
	public static void main(String[] args) 
	{
		int[] arr= {2,3,4,6,8};
		boolean flag=true;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				flag=false;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("All numbers are divisible by 2");
		}
		else
		{
			System.out.println("All numbers are not divisible by 2");
		}
	}
	
}
