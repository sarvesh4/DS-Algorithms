package com.sarvesh.ds.Arrays;

public class MissingNumber {
	
	public static void main(String[] args) {

		int arr[] = {0,1,3,4,2,5,7};
		int result = findMissingNumber(arr);
		System.out.println(result);

	}

	private static int findMissingNumber(int[] arr) {
		int n=arr.length;
		int totalSum=(n*(n+1))/2;
		
		for (int i : arr) {
			totalSum-=i;
		}
		return totalSum;
	}

}
