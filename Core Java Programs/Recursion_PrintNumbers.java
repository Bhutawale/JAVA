package com.method;

public class Recursion_PrintNumbers	 //printing numbers without loop
{
	public static void printnumbers(int start,int end)
	{
		if(start<=end)
		{
			System.out.print(start+" ");
			printnumbers(start+1,end);
		}
	}
	public static void main(String[] args)
	{
		printnumbers(1,100);
	}
}
