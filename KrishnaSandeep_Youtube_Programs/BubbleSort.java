package com.KrishnaSandeep_Youtube_Programs;

public class BubbleSort 
{
	public static int[] bubbleSort(int[] arr)
	{
		
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
		
		return arr;
	}
	public static void main(String[] args) 
	{
		int[] arr= {4,3,5,6,1,2,8};
		int[] bubbleSort = bubbleSort(arr);
		for(int n:bubbleSort)
			System.out.print(n+" ");
	}
}
