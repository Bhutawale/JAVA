package com.KrishnaSandeep_Youtube_Programs;

public class MaximumDiffBetwArrayElements
{
	public static int maxDiff(int[] arr)
	{
		int diff=0;
		int max=arr[0];
		int min=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
				max=arr[i];
			if(arr[i]<min)
				min=arr[i];
		}
		System.out.println("Maximum Number: "+max);
		System.out.println("Minimum Number: "+min);
		diff=max-min;
		return diff;
	}
	public static void main(String[] args) 
	{
		int[] arr= {2,3,10,4,5,6};
		int maxDiff = maxDiff(arr);
		System.out.println("Maximum Difference: "+maxDiff);
	}
}
