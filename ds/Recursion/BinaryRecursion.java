package com.sarvesh.ds.Recursion;

public class BinaryRecursion {
	
	public static void main(String[] args) {
	
		int nums[] = {1, 4, 5, 8, 15, 18, 24, 36, 49, 56, 58, 64};
		int target = 100;
		int low =0;
		int high = nums.length-1;
		
		int result= binarySearchRecursive(nums,target,low,high);
		System.out.println("Number found in Array at Index " +result);
		
	}

	private static int binarySearchRecursive(int[] nums, int target, int low, int high) {
		if(low<=high) {
			
			int mid = (low+high)/2;
			
			if(nums[mid]==target) {
				return mid;
			}
			else if(nums[mid]>target){
				return binarySearchRecursive(nums,target,low,mid-1);
			}
			else {
				return binarySearchRecursive(nums,target,mid+1,high);
			}
		}
		return -1;
	}

}
