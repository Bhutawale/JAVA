package com.KrishnaSandeep_Youtube_Programs;

public class Pattern10 
{
	public static void main(String[] args) 
	{
		int alpha=65;
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print((char)(alpha));
			}
			alpha++;
			System.out.println();
		}
	}
}
