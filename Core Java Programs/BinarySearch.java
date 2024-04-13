package com.method;

public class BinarySearch 
{
	public static int binarysearch(int[] arr,int search)
	{
		int low=0;
		int high=arr.length-1;
		while(low<=high)
		{
			int mid=(low+high)/2;
			
			if(arr[mid]==search)
				return mid;
			else if(arr[mid]<search)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}
	static public void main(String[] args) 
	{
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		int search=6;
		int binarysearch = binarysearch(arr,search);
		
		if(binarysearch!=-1)
			System.out.println("Element found at index: "+binarysearch);
		else
			System.out.println("Element Not found");
	}
}
