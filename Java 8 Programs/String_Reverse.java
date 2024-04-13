package com.Java_8_Programs;

@FunctionalInterface
interface interf9
{
	public void reverse(String str);
}

public class String_Reverse 
{
	public static void main(String[] args)
	{
		String str="satish";
		interf9 i=(s)->
					{
						char[] array = s.toCharArray();
						for(int j=array.length-1;j>=0;j--)
						{
							System.out.print(array[j]);
						}
						
					};
		i.reverse(str);
	}
}
