package com.sarvesh.ds.Arrays;

public class findPeakInMountainArray {
	
	public static void main(String[] args) {
		
		int nums[] = {1, 4, 5, 8, 22, 15, 18, 20, 84, 72, 64, 54, 42, 25, 12, 8, 3, 2, 1};
		int n = nums.length;
		System.out.println("Peak of Mountain Array is at Index : " +peakElement(nums,n));
	
	}

	private static int peakElement(int[] nums, int n) {
		
		if(n==1)
			return 0;
		if(nums[0]>=nums[1])
			return 0;
		if(nums[n-1]>=nums[n-2])
			return n-1;
		
		for(int i=1;i<n-1;i++) {
			if(nums[i]>=nums[i-1] && nums[i]>=nums[i+1])
				return i;
		}
		return 0;
	}
	

}
