package com.KrishnaSandeep_Youtube_Programs;

public class ReverseElementsInArray 
{
	public static int[] reverse(int[] arr)
	{
		int index=0;
		int[] revarr=new int[arr.length];
		
		for(int i=arr.length-1;i>=0;i--)
		{
			revarr[index]=arr[i];
			index++;
		}
		return revarr;
	}
	public static void main(String[] args) 
	{
		int[] arr= {12,3,2,4,6};
		int[] reverse = reverse(arr);
		for(int n:reverse)
			System.out.print(n+",");
	}
}
