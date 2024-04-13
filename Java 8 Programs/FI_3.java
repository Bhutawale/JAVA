package com.Java_8_Programs;

import java.util.Scanner;

@FunctionalInterface
interface inter
{
	public void prime(int num);
}
public class FI_3 
{
	public static void main(String[] args) 
	{
		int num;
		System.out.println("Enter the number: ");
		Scanner scan=new Scanner(System.in);
		num=scan.nextInt();
		scan.close();
		inter i=(n)->
			{	
				int count=0;
				if(n>1)
				{
					for(int j=1;j<=n;j++)
					{
						if(n%j==0)
						{
							count++;
						}
					}
					if(count==2)
					{
						System.out.println("Number is prime");
					}
					else
					{
						System.out.println("Number is not prime");
					}
				}
				else
				{
					System.out.println("Number is not prime");
				}	
			};
			
			i.prime(num);
}
}
