package com.method;

public class LongestString 
{
	public static void main(String[] args)
	{
		String[] arr=new String[] {"satish","sanskruti","sanskar"};
		String lstr=arr[0];
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].length()>lstr.length())
			{
				lstr=arr[i];
			}
		}
		System.out.println("Longest String: "+lstr);
	}
}
