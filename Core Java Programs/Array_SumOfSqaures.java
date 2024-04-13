	package com.method;
	
	public class Array_SumOfSqaures 
	{
		public void sum(int[] arr)
		{
			int sum=0;
			for(int i=0;i<arr.length;i++)
			{
				int square=arr[i]*arr[i];
				sum=sum+square;
			}
			System.out.println("The Sum of squares is: "+sum);
		}
		public static void main(String[] args) {
			int[] arr=new int[] {1,2,3,4,5};
			Array_SumOfSqaures sq=new Array_SumOfSqaures();
			sq.sum(arr);
		}
	}
