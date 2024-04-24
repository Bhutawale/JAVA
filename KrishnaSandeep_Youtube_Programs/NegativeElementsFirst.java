package com.KrishnaSandeep_Youtube_Programs;

public class NegativeElementsFirst 
{
	public static int[] negativeFirst(int[] arr)
	{
		int[] newarr=new int[arr.length];
		int index=0;
		for(int i=0;i<arr.length;i++)
			if(arr[i]<0)
			{
				newarr[index]=arr[i];
				index++;
			}
		
		for(int i=0;i<arr.length;i++)
			if(arr[i]>0)
			{
				newarr[index]=arr[i];
				index++;
			}
		return newarr;
	}
	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,-3,-40,5,6,7,-10};
		int[] negativeFirst = negativeFirst(arr);
		for(int n:negativeFirst)
			System.out.print(n+" ");
	}
}
