package com.sarvesh.ds.Arrays;

import java.util.Arrays;

public class MissingAndRepeatingArray {

	public static void main(String[] args) {

		int arr[] = {6,1,3,4,2,7,4};
		int[] result = findMissingandRepeatingNumber(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] findMissingandRepeatingNumber(int[] arr) {
		int[] result = new int[2];
		int n = arr.length;
		
		Arrays.sort(arr);
		
		for(int i=0; i<n; i++) {
			if(i == n-1){
                break;
            }
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
