package com.method;

public class Arrays_IndicesAddition 
{
	public static void main(String[] args) {
		int[] arr= {3,2,4};
		int target=7;
		
		int[] op=new int[2];
		boolean flag=false;
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if((arr[i]+arr[j])==target)
				{
					op[0]=i;
					op[1]=j;
					flag=true;
				}
			}
		}
		if(flag)
		{
			for(int k:op)
			{
				System.out.print(k+" ");
			}
		}
		else 
		{
			System.out.println("No Match found");
		}
	}
}