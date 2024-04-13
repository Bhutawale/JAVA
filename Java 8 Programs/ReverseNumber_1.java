package com.Java_8_Programs;

@FunctionalInterface
interface inter_rev
{
	public void reverse(int num);
}
public class ReverseNumber_1
{
	public static void main(String[] args) 
	{
		inter_rev r=(num)->
		{
			int rev=0;
			while(num>0)
			{
				int n=num%10;
				rev=rev*10+n;
				num=num/10;
			}
			System.out.println(rev);
		};
		r.reverse(1234);
	}
}
