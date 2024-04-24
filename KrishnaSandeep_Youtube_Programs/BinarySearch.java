package com.KrishnaSandeep_Youtube_Programs;

public class BinarySearch 
{
	public static int search(int[] arr,int target)
	{
		int first=0;
		int last=arr.length-1;
	
		
		while(first<=last)
		{
			int mid=(first+last)/2;
			if(arr[mid]==target)
				return mid;
			else if(arr[mid]<target)
				first=mid+1;
			else
				last=mid-1;
		}
		return -1;
	}

	public static void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7};
		int target=2;
		int search = search(arr,target);
		if(search!=-1)
		{
			System.out.println("Target found at index: "+search);
		}
		else
		{
			System.out.println("Target not found.");
		}
	}
}
