package com.programs;

public class Array_MaxProduct 
{
	static int maxProduct(int[] arr)
	{
		int maxProduct=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]*arr[j]>maxProduct)
				{
					maxProduct=arr[i]*arr[j];
				}
			}
		}
		return maxProduct;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,10,-60,100};
		int maxProduct = maxProduct(arr);
		System.out.println(maxProduct);
	}
}
