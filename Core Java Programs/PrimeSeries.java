package com.method;

import java.util.Scanner;

public class PrimeSeries
{
	public static void prime(int l)
	{
		
		String primenumber="";
		for(int i=1;i<=l;i++)
		{
			int count=0;
			for(int j=i;j>=1;j--)
			{
				if(i%j==0)
				{
					count=count+1;
				}
			}
			if(count==2)
			{
				primenumber=primenumber+i+" ";
			}
		}
		System.out.println(primenumber);
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the limit: ");
		Scanner scan=new Scanner(System.in);
		int limit=scan.nextInt();
		prime(limit);
	}
}
