package com.method;

public class Array_ElementStartWithLetter
{
	public void letter(String[] s)
	{
		String[] newarr=new String[s.length];
		int index=0;
		for(String str:s)
		{
			if(str.startsWith("b"))
			{
				newarr[index]=str;
				index++;
			}
		}
		System.out.println("Elements Starting with letter 'B' :");
		for(String st:newarr)
		{
			if(st!=null)
			{
				System.out.print(st+" ");
			}
		}
	}
	public static void main(String[] args) {
		String[] str=new String[] {"apple","banana","cherry","blackberry","baaa"};
		System.out.println("Original Array: ");
		for(String s:str)
		{
			System.out.print(s+" ");
		}
		System.out.println();
		Array_ElementStartWithLetter l=new Array_ElementStartWithLetter();
		l.letter(str);
		
	}
}
