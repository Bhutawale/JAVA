package com.method;

import java.util.Scanner;

public class SwappingNumbers 
{
	public void swap(int n1,int n2)
	{
		int temp;
		System.out.println("Before Swapping: ");
		System.out.println(n1 + " "+ n2);
		temp=n1;
		n1=n2;
		n2=temp;
		System.out.println("After Swapping: ");
		System.out.println(n1 + " "+n2);
	}
	public static void main(String[] args) {
		System.out.println("Enter number 1: ");
		Scanner s1=new Scanner(System.in);
		int n1=s1.nextInt();
		System.out.println("Enter number 2: ");
		Scanner s2=new Scanner(System.in);
		int n2=s2.nextInt();
		SwappingNumbers sn=new SwappingNumbers();
		sn.swap(n1,n2);
	}
}
