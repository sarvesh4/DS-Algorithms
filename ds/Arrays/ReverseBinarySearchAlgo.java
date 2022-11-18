package com.sarvesh.ds.Arrays;

public class ReverseBinarySearchAlgo {
	
	public static void main(String[] args) {
		
		int nums[] = {84,72,64,54,42,25,12,8,3,2,1};
		int target = 3;
		
		int result = reverseBinarySearch(nums,target);
		if(result==1)
			System.out.println("Number is present in the Reverse BinarySearch array");
		else
			System.out.println("Number is not present in the Reverse BinarySearch array");
	}

	private static int reverseBinarySearch(int[] nums, int target) {
		int low=0,high=nums.length-1;
		
		while(low<=high) {
			int mid=(low+high)/2;
			if(nums[mid]==target)
				return 1;
			if(nums[mid]>target)
				low=mid+1;
			else
				high=mid-1;
		}
		return -1;
	}

}
