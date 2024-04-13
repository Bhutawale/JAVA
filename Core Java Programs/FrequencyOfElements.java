package com.method;

public class FrequencyOfElements 
{
	public static void main(String[] args) 
	{
		int[] arr= {10,20,30,10,30,40,50,50,50,60};
		int[] count=new int[256];
		
		for(int i=0;i<arr.length;i++)
		{
			count[arr[i]]++;
		}	
		for(int i=0;i<count.length;i++)
		{
			if(count[i]!=0)
			{
				System.out.println(i +" : "+count[i]);
			}
		}
	}
}
