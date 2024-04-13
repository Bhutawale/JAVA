package com.Java_8_Programs;

import java.util.Scanner;

@FunctionalInterface
interface inter2
{
	public void palindrom(int num);
}

public class FI_2 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();
		inter2 i=(n)->
					{
						int rev=0;
						while(n!=0)
						{
							int r=n%10;
							rev=rev*10+r;
							n=n/10;
						}
						if(rev==num)
						{
							System.out.println("Palindrom Number");
						}
						else
						{
							System.out.println("Not Palindrom Number");
						}
					};
					i.palindrom(num);
					scan.close();
	}
}
