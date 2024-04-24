package com.KrishnaSandeep_Youtube_Programs;

public class FirstNonRepetativeChar 
{
	public static char firstNonRepChar(String str)
	{
		char[] array = str.toCharArray();
		
		for(int i=0;i<array.length;i++)
		{
			boolean rep=false;
			for(int j=0;j<array.length;j++)
			{
				if(i!=j && array[i]==array[j])
				{
					rep=true;
					break;			
				}
			}
			if(!rep)
				return array[i];
		}
		return '\0';
	}
	public static void main(String[] args) 
	{
		String str="aabbeefgh";
		char c = firstNonRepChar(str);
		System.out.println(c);
	}
}
