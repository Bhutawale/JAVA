package com.KrishnaSandeep_Youtube_Programs;

public class TwoSumProblem
{
	public static void twoSum(int[] arr,int sum)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]+arr[j]==sum)
				{
					System.out.println(arr[i]+","+arr[j]);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		int[] arr= {10,20,30,40,50};
		int sum=50;
		twoSum(arr,sum);
	}
}
