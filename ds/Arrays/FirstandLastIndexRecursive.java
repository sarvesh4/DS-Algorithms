package com.sarvesh.ds.Arrays;

public class FirstandLastIndexRecursive {
	
public static void main(String[] args) {
		
		int nums[] = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5};
		int target = 4;
		int firstIndex = firstIndex(nums, target, 0, nums.length-1);
		int lastIndex = lastIndex(nums, target, 0,  nums.length-1);
		System.out.println("First Index is " +firstIndex+ " Last Index is " +lastIndex);
		
	}
	
	private static int firstIndex(int[] nums, int target, int low, int high) {
	
		if(low<=high) {
			
			int mid=(low+high)/2;
			
			if(( mid==0 || target > nums[mid-1]) && nums[mid] == target) {
				return mid;
			}
			else if(target>nums[mid]) {
				return firstIndex(nums,target,mid+1,high);
			}
			else {
				return firstIndex(nums,target,low,mid-1);
			}
		}
		return -1;
	}

	private static int lastIndex(int[] nums, int target, int low, int high) {
		
		if(low<=high) {
			
			int mid=(low+high)/2;
			int n=nums.length;
			
			if(( mid==n-1 || target < nums[mid+1]) && nums[mid]==target) {
				return mid;
			}
			else if(target<nums[mid]) {
				return lastIndex(nums,target,low,mid-1);
			}
			else {
				return lastIndex(nums,target,mid+1,high);

			}
		}
		return -1;
	}

}
