package com.method;

public class SecondHighest
{
	public static void main(String[] args) 
	{
		int[] arr= {100,30,40,10,60,100};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("Sorted Array: ");
		for(int k:arr)
		{
			System.out.print(k+" ");
		}
		System.out.println();
		//System.out.println("Second Highest Element: "+ arr[arr.length-2]);
		
		
		for(int i=arr.length-2;i>=0;i--)
		{
			if(arr[i]!=arr[arr.length-1])
			{
				System.out.println("Second Largest Number: "+arr[i]);
				break;
			}
		}
	}
}
