package com.method;

import java.util.Arrays;

public class Array_Comparison01 
{
	public void compare(int[] arr1,int[] arr2)
	{
		boolean flag=true;
		if(arr1.length!=arr2.length)
		{
			flag=false;
		}
		else
		{
			Arrays.sort(arr1);
			Arrays.sort(arr2);
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					flag=false;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("Arrays are same");
		}
		else
		{
			System.out.println("Arrays are not same");
		}
		
	}
	public static void main(String[] args) {
		int[] arr1={10,20,30,40};
		int[] arr2= {20,40,30,10};
		Array_Comparison01 ac=new Array_Comparison01();
		ac.compare(arr1,arr2);
	}
}
