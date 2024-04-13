package com.method;

public class Array_FirstDuplicateNumber {
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,1,5,2};

		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("First Duplicate Element: "+arr[i]);
					return;
				}
			}
		}
	

	}
}
