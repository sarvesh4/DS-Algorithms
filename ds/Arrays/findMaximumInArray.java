package com.sarvesh.ds.Arrays;

public class findMaximumInArray {
	
	public static void main(String[] args) {
		
		int arr[] = {1, 30, 40, 50, 60, 70, 90, 108, 23, 20, 420};
		int n= arr.length;
		int maxElement = findMax(arr);
		System.out.println("Maximum element in Array is : " +maxElement);
	}

	private static int findMax(int[] arr) {
		int low=0,high=arr.length-1;
		int max = arr[low];
		for(int i=low;i<=high;i++) {
			if(arr[i]>max)
				max=arr[i];
		}
		return max;
	}

}
