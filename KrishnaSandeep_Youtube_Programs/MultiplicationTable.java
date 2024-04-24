package com.KrishnaSandeep_Youtube_Programs;

import java.util.Scanner;

public class MultiplicationTable
{
	public static void table(int num)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(num+" "+"*"+" "+i+" "+"="+" "+i*num);
		}
	}
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		table(num);
		scan.close();
	}
}
