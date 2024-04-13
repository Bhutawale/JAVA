package com.method;

public class Array_StartEndSameCharacter 
{
	public void startend(String[] arr)
	{
		String[] newarr=new String[arr.length];
		int limit=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i].matches("^(.).*(\\1)$"))
			{
				newarr[limit]=arr[i];
				limit++;
			}
		}
		System.out.println("New Array with same letters at start and end is: ");
		for(String s:newarr)
		{
			if(s!=null)
			{
				System.out.println(s);
			}
		}
	}
	public static void main(String[] args) {
		String[] arr=new String[] {"aba","xyx","abc","bcb","xyz"};
		System.out.println("Original Array: ");
		for(String s:arr)
			System.out.println(s);
		Array_StartEndSameCharacter se=new Array_StartEndSameCharacter();
		se.startend(arr);
	}
}
