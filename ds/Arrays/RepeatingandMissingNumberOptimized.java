package com.sarvesh.ds.Arrays;

import java.util.Arrays;

public class RepeatingandMissingNumberOptimized {
	
	public static void main(String[] args) {

		int arr[] = {6,1,3,4,2,5,4};
		int[] result = findMissingandRepeatingNumber(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] findMissingandRepeatingNumber(int[] arr) {
		int n=arr.length;;
		int[] result = new int[2];
		
		Arrays.sort(arr);
		
		int i=0;
		while(i<n) {
			if(arr[i]==arr[arr[i]-1]) {
				i++;
			}
			else {
				if(arr[i]!=arr[arr[i]-1]) {
					swap(arr,i,arr[i]-1);
				}
				else {
					i++;
				}
			}
		}
		
		for(i=0; i<n; i++) {
			if(arr[i]!=i+1) {
				result[0]=arr[i];
				result[1]=i+1;
				break;
			}
		}
		
		return result;
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;		
	}

}
