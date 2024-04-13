package com.method;

public class Array_FindNumberStartWith 
{
	public void find(int[] arr)
	{
		int[] newarr=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			String str = String.valueOf(arr[i]);
			if(str.charAt(0)=='1')
			{
				newarr[i]=Integer.valueOf(str);
			}
		}
		System.out.println("Numbers Starting with 1: ");
		for(int n:newarr)
		{
			if(n!=0)
			{
				System.out.println(n);
			}
		}
	}
	public static void main(String[] args) {
		int[] arr=new int[] {10,20,30,100,11};
		Array_FindNumberStartWith f=new Array_FindNumberStartWith();
		f.find(arr);
	}
}
