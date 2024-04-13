package com.method;

public class ReverseStringPreserveSpace 
{
	//I/o- Welcome to Java
	//O/p- avaJ ot emocleW
	public static void main(String[] args)
	{
		String str="Welcome to Java";
		String[] split = str.split(" ");
		String 	newstr="";
		for(int i=split.length-1;i>=0;i--)
		{
			char[] arr = split[i].toCharArray();
			String rev="";
			for(int j=arr.length-1;j>=0;j--)
			{
				rev=rev+arr[j];
			}
			newstr=newstr+rev+" ";
		}
		
		System.out.println(newstr);
	}
}
