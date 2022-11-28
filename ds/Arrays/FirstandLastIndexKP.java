package com.sarvesh.ds.Arrays;

public class FirstandLastIndexKP {
	
	public static void main(String[] args) {
		
		int nums[] = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5};
		int target = 0;
		int firstIndex = firstIndex(nums,target);
		int lastIndex = lastIndex(nums,target);
		System.out.println("First Index is " +firstIndex+ " Last Index is " +lastIndex);
		
	}

	private static int firstIndex(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(mid>0 && nums[mid]==target && nums[mid-1]!=target) {
				return mid;
			}
			else if(nums[mid]>=target) {
				high = mid-1;
			}
			else {
				low =mid+1;
			}
		}
		return -1;
	}

	private static int lastIndex(int[] nums, int target) {
		int low = 0;
		int high = nums.length-1;
		int n = nums.length-1;
		
		while(low<=high) {
			int mid = (low+high)/2;
			if(mid < n-1 && nums[mid]==target && nums[mid+1]!=target){
				return mid;
			}
			else if(nums[mid]<=target) {
				low =mid+1;
			}
			else {
				high = mid-1;
			}
		}
		return -1;
	}

}
