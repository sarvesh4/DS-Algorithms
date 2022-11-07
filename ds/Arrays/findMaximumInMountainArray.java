package com.sarvesh.ds.Arrays;

public class findMaximumInMountainArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 30, 40, 50, 60, 70, 90, 23, 20};
		int n= arr.length;
		int maxElement = findMax(arr,0,n-1);
		System.out.println("Maximum element in Array is : " +maxElement);
	}

	private static int findMax(int[] arr, int low, int high) {
		
		int max = arr[low];
		for(int i=low;i<=high;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

}
