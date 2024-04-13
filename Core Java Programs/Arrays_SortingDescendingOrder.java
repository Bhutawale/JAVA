package com.method;

import java.util.Arrays;
import java.util.Collections;

public class Arrays_SortingDescendingOrder {
	public static void main(String[] args) {
		Integer[] arr= {1,2,3,4,5};
		
		System.out.println("Reverse Order Sorting of Array: ");
		Arrays.sort(arr, Collections.reverseOrder());
		for(int n:arr)
			System.out.println(n);
	}
}
