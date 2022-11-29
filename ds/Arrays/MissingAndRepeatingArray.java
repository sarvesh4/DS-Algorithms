package com.sarvesh.ds.Arrays;

import java.util.Arrays;

public class MissingAndRepeatingArray {

	public static void main(String[] args) {

		int arr[] = {3,1,2,4,5,6,4};
		int[] result = findMissingandRepeatingNumber(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] findMissingandRepeatingNumber(int[] arr) {
		int[] result = new int[2];
		int n = arr.length;
		
		Arrays.sort(arr);
		
		for(int i=0; i<n-1; i++) {
			if(arr[i]==arr[i+1]) {
				result[0]=arr[i];
			}
		}
		
		for(int i=0; i<=n-1; i++) {
			if(arr[i]!=i+1) {
				result[1]=i+1;
				break;
			}
		}
		return result;
	}

}
