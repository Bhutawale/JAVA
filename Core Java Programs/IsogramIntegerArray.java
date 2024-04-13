package com.method;

public class IsogramIntegerArray 
{
	public static void main(String[] args)
	{
		int[] arr= {1,2,3,4,5,6,6};
		boolean flag=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					flag=true;
					break;
				}
			}
		}
		if(flag==true)
		{
			System.out.println("Given array is not Isogram");
		}
		else
		{
			System.out.println("Given array is Isogram");
		}
	}
}
