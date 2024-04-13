package com.method;

import java.util.Scanner;

public class MultiplicationTable 
{
	public void table(int num)
	{
		System.out.println("Multiplication Table of "+num);
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" * "+i+" = "+(num*i));
		}
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		MultiplicationTable mul=new MultiplicationTable();
		mul.table(num);
		scan.close();
	}
}
