package com.method;

public class IsogramString
{
	public static void main(String[] args) 
	{
		String str="pen";
		int[] count=new int[256];
		boolean flag=false;
		for(int i=0;i<str.length();i++)
		{
			count[str.charAt(i)]++;
		}
		for(int j:count)
		{
			if(j>1)
			{
				flag=true;
				break;
			}
		}
		if(flag==true)
		{
			System.out.println("Not Isogram");
		}
		else
		{
			System.out.println("Isogram String");
		}
		
	}
}
