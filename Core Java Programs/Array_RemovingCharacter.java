package com.method;


public class Array_RemovingCharacter
{
	public void remove(String[] arr)
	{
		String[] newarr=new String[arr.length];
		int index=0;
		
		for(String s:arr)
		{
			if(!s.matches(".*na.*"))
			{
				newarr[index]=s;
				index++;
			}
		}
		System.out.println("New Array: ");
		for(String s:newarr)
		{
			if(s!=null)
			{
				System.out.print("["+s+"]");
			}
		}
	}
	public static void main(String[] args) {
		String[] arr=new String[] {"apple","banana","cherry","canana","sasa"};
		System.out.println("Original Array: ");
		for(String s:arr)
		{
			System.out.print("["+s+"]");
		}
		System.out.println();
		Array_RemovingCharacter r=new Array_RemovingCharacter();
		r.remove(arr);
	}
}
