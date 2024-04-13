package com.method;

public class Array_MaximumValue 
{
	public int findmax(int[] arr)
	{
		int max=arr[0];
		for(int n:arr)
		{
			if(n>max)
			{
				max=n;
			}
		}
		return max;
	}
	public static void main(String[] args) {
		int[] arr=new int[] {1,2,3,4,5,6,7,10};
		Array_MaximumValue max=new Array_MaximumValue();
		int max_value = max.findmax(arr);
		System.out.println("The maximum value in given array is: "+max_value);
	}
}
