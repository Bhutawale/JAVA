package com.method;

public class LengthOfLastWord 
{
	public static void main(String[] args) {
		String str="welcome to java satish";
		
		String[] split = str.split(" ");
		
		for(int i=0;i<split.length;i++)
		{
			if(i==split.length-1)
			{
				System.out.println(split[i].length());
			}
		}
	}
}
