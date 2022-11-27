package com.sarvesh.ds.Iteration;

public class MaxInArrayIteration {
	
	public static void main(String[] args) {
		
		
		int nums[] = {1, 4, 5, 8, 172, 64, 54, 42, 25};
		int n = nums.length;
		int max = nums[0];
		int j=0;
		
		while(j<n-1) {
			if(max > nums[j+1]) {
				max=max;
			}
			else {
				max=nums[j+1];
			}
			j++;
		}
		System.out.println(max);
		

		for (int i=0;i<n-1;i++) {
			if(max > nums[i+1]) {
				max=max;
			}
			else {
				max=nums[i+1];
			}				
		}
		System.out.println(max);
		
		for (int i=1;i<n;i++) {
			if(nums[i]>max) {
				max=nums[i];
			}
		}
		System.out.println(max);
		
	}

}

