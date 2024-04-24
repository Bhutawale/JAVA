package com.KrishnaSandeep_Youtube_Programs;

public class FindMissingNumberInArray 
{
	public static int missingNumber(int[] arr)
	{
		int n=arr.length+1;
		int arrsum=0;
		for(int i:arr)
		{
			arrsum=arrsum+i;
		}
		int actualsum=n*(n+1)/2;
		int missing=actualsum-arrsum;
		
		if(missing==n) 
		{
			return 0;
		}
		return missing;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,6,7,8,9,10};
		int missingNumber = missingNumber(arr);
		System.out.println("Missing Number is: "+missingNumber);
	}
}
