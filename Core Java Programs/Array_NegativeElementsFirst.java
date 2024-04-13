package com.method;

public class Array_NegativeElementsFirst
{
	public static void main(String[] args) 
	{
		int[] arr= {2,4,-1,5,0,-3,-9};
		
		int[] newarr=new int[arr.length];
		
		int index=0;
		
		for(int i:arr)
		{
			if(i<0)
			{
				newarr[index]=i;
				index++;
			}
		}
		
		for(int i:arr)
		{
			if(i>0)
			{
				newarr[index]=i;
				index++;
			}
		}
		System.out.println("New Array: ");
		for(int j:newarr)
		{
			System.out.print(j+" ");
		}
	}
}
