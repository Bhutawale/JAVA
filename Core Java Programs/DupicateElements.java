package com.method;

public class DupicateElements 
{
	public static void main(String[] args) {
		String[] arr= {"java","c","c++","python","java"};
		boolean dup=false;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i].equals(arr[j]))
				{
					dup=true;
					System.out.println(arr[i]);
					break;
				}
			}
		}
		if(dup)
		{
			System.out.println("Duplicate Found");
		}
		else
		{
			System.out.println("Duplicate not Found");
		}
	}
}
