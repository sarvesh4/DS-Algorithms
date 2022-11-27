package com.sarvesh.ds.Iteration;

public class MinInArray {
	
	
	public static void main(String[] args) {
		
		int nums[] = {172, 28, 1, 4, 5, 8, -2, 64, 54, 42, 25};
		int n= nums.length;
		int max = nums[0];
		
		for (int i=1;i<n;i++) {
			if(nums[i]<max) {
				max=nums[i];
			}
		}
		
		System.out.println(max);
		
	}
}
