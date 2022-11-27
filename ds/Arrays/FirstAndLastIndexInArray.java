package com.sarvesh.ds.Arrays;

public class FirstAndLastIndexInArray {
	
	
	public static void main(String[] args) {
		
		int nums[] = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5};
		int target = 4;
		int firstIndex = firstIndex(nums,target);
		int lastIndex = lastIndex(nums,target);
		System.out.println("First Index is " +firstIndex+ " Last Index is " +lastIndex);
		
	}

	private static int firstIndex(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int firstIndex = -1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(target < nums[mid]) {
				high = mid-1;
			}
			else if(target>nums[mid]) {
				low=mid+1;
			}
			else {
				firstIndex = mid;
				high = mid -1;
			}		
		}		
		return firstIndex;
	}
	
	private static int lastIndex(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int lastIndex = -1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(target < nums[mid]) {
				high = mid-1;
			}
			else if(target>nums[mid]) {
				low=mid+1;
			}
			else {
				lastIndex = mid;
				low = mid+1;
			}		
		}		
		return lastIndex;
	}
}
