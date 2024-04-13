package com.method;

import java.util.Arrays;

public class CompareArrays
{
	public static void main(String[] args) 
	{
		int[] arr1= {5,4,2,1,3};
		int[] arr2= {1,2,3,4,5};
		
		//Arrays.sort(arr1);
		//Arrays.sort(arr2);
		
		boolean status=true;
		
		if(arr1.length==arr2.length)
		{
			for(int i=0;i<arr1.length;i++)
			{
				if(arr1[i]!=arr2[i])
				{
					status=false;
					break;
				}
			}
		}
		else
		{
			status=false;
		}
		if(status)
		{
			System.out.println("Arrays Equal");
		}
		else
		{
			System.out.println("Arrays not equal");
		}
	}
}
