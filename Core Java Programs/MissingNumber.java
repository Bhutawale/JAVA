package com.method;

class MissingNumber
{
	public static void missingnumber()
	{
		int sum=0;
		int arr_sum=0;
		int[] arr=new int[] {1,2,3,5,6,7,8,9,10};
		for(int i=0;i<=10;i++)
		{
			sum=sum+i;
		}
		for(int j=0;j<arr.length;j++)
		{
			arr_sum=arr_sum+arr[j];
		}
		
		int miss_num=sum-arr_sum;
		System.out.println("Missing number in the given array is: "+miss_num);
	}
	public static void main(String[] args) 
	{
		missingnumber();
	}
}
