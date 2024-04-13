package com.method;

public class Array_CountStringOccurance
{
	public int occurance(String[] arr)
	{
		int count=0;
		for(String s:arr)
		{
			if(s.contentEquals("apple"))
			{
				count++;
			}
		}
		return count;
	}
	public static void main(String[] args) {
		String[] arr=new String[] {"apple","banana","apple","cherry","apple"};
		System.out.println("Original Array: ");
		for(String s:arr)
		{
			System.out.print("["+s+"]");
		}
		System.out.println();
		Array_CountStringOccurance o=new Array_CountStringOccurance();
		int occurance = o.occurance(arr);
		System.out.println("Number of occurance of apple is: "+occurance);
	}
}
