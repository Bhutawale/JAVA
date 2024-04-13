package com.method;

public class Array_CheckAllEven 
{
	public void check(int[] arr)
	{
		boolean allEven=true;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				allEven=false;
				break;
			}
		}
		if(allEven)
		{
			System.out.println("All numbers are even");
		}
		else
		{
			System.out.println("All numbers are Not even");
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {2,4,6,1};
		Array_CheckAllEven c=new Array_CheckAllEven();
		c.check(arr);
	}
}
