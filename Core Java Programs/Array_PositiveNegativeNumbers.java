package com.method;

public class Array_PositiveNegativeNumbers
{
	public static void main(String[] args) 
	{
		int[] arr= {9,10,-18,20,-27,30,-36,40,45,50};
		
		int[] positive_arr=new int[arr.length];
		
		int[] negative_arr=new int[arr.length];
		
		int count_p=0;
		int count_n=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				positive_arr[count_p]=arr[i];
				count_p+=1;
			}
			
			else if(arr[i]<0)
			{
				negative_arr[count_n]=arr[i];
				count_n+=1;
			}
		}
		
		for(int n:positive_arr)
		{
			if(n!=0)
			System.out.print(n+" ");
		}
		System.out.println();
		System.out.println("Total Positive Numbers: "+count_p);
		
		for(int m:negative_arr)
		{
			if(m!=0)
			System.out.print(m+" ");
		}
		System.out.println();
		System.out.println("Total Negative Numbers: "+count_n);
	}
}
