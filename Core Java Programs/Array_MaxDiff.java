package com.method;

public class Array_MaxDiff 
{
	public void difference(int[] arr)
	{
	
		int[] difference=new int[arr.length];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				difference[i]=arr[j]-arr[i];
			}
		}
		
		int max=difference[0];
		for(int i=0;i<difference.length;i++)
		{
			if(difference[i]>max)
			{
				max=difference[i];
			}
		}
		System.out.println("Maximum Difference is:"+max);
	}
	public static void main(String[] args) {
		int[] arr=new int[] {100,90,40,180};
		Array_MaxDiff d=new Array_MaxDiff();
		d.difference(arr);
	}
}
