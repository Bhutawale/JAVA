package com.KrishnaSandeep_Youtube_Programs;

public class AddingZerotoEndOfArray 
{
	public static int[] rearrange(int[] arr)
	{
		int[] newarr =new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				newarr[index]=arr[i];
				index++;
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==0)
			{
				newarr[index]=arr[i];
				index++;
			}
		}
		
		return newarr;
	}
	public static void main(String[] args) 
	{
		int[] arr= {10,20,0,0,30,40,50};
		int[] rearrange = rearrange(arr);
		for(int n:rearrange)
			System.out.print(n+" ");
 	}
}
