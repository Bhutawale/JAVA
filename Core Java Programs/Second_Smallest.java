package com.method;

public class Second_Smallest 
{
	public void small(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println();
		System.out.println("Sorted array");
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
		System.out.println();
		int s=arr[arr.length-2];
		System.out.println("Second Smallest value in array is: "+s);
	}
	public static void main(String[] args) {
		int[] arr=new int[] {2,3,4,5,1};
		System.out.println("Original Array: ");
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
		Second_Smallest s=new Second_Smallest();
		s.small(arr);
	}
}
