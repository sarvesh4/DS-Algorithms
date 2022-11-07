package com.sarvesh.arrays;

import java.util.Arrays;

public class ArraysSort {
	
	public static void main(String[] args) {
		int arr[]= {5,2,4,9,10,7,3,8,2,1};
		
		Arrays.sort(arr);
		
		System.out.println(arr);
		
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}

}
