package com.method;

import java.util.Scanner;

public class FibonacciSeries_nthElement 
{
	public static void main(String[] args) 
	{
		int n;
		System.out.println("Enter the nth element to print: ");
		Scanner scan=new Scanner(System.in);
		n=scan.nextInt();
		
		int pre=0;int curr=1;

		for(int i=2;i<=n;i++)
		{
			int temp=curr;
			curr=pre+curr;
			pre=temp;
		}
		System.out.println(curr);
		scan.close();
	}
}
