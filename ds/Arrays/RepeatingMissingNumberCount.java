package com.sarvesh.ds.Arrays;

import java.util.Arrays;

public class RepeatingMissingNumberCount {
	
	public static void main(String[] args) {

		int arr[] = {3,1,2,7,5,6,7};
		int[] result = findMissingandRepeatingNumber(arr);
		System.out.println(Arrays.toString(result));

	}

	private static int[] findMissingandRepeatingNumber(int[] arr) {
		int[] result = new int[2];
		int n = arr.length;
		
		Arrays.sort(arr);
		
		int[] count = new int[n];
		Arrays.fill(count, 0);
		
		
		 for(int i=0; i<n; i++) { 
			 count[arr[i]-1]=count[arr[i]-1]+1; 
			 }
		 
		  for(int i=0; i<n; ++i) { 
			  if(count[i] == 0) { 
				  result[1]=i+1; }
		  
			  if(count[i]==2) { 
				  result[0]=i+1; }
		  
		  }
		  
        
		
		return result;
	}

}
