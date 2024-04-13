package com.method;

import java.util.Scanner;

public class BinaryNumber 
{
	public void binary(int n)
	{
		boolean isbinary=true;
		while(n!=0)
		{
			int rem=n%10;
			if(rem>1)
			{
				isbinary=false;
				break;
			}
			else
			{
				n=n/10;
			}
		}
		if(isbinary)
		{
			System.out.println("Number is Binary");
		}
		else
		{
			System.out.println("Number is not Binary");
		}
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		BinaryNumber bn=new BinaryNumber();
		bn.binary(num);
		scan.close();
	}
}
