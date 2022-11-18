package com.sarvesh.ds.Arrays;

public class BinarySearchAlgo {

public static void main(String[] args) {
		
		int nums[] = {1, 4, 5, 8, 15, 18, 24, 36, 49, 56, 52, 64};
		int target = 51;
		
		int result= binarySearch(nums,target);
		if(result==1)
			System.out.println("Number is present in the BinarySearch array");
		else
			System.out.println("Number is not present in the BinarySearch array");
		
}

private static int binarySearch(int[] nums, int target) {
	int low=0,high=nums.length-1,mid;
	
	while(low<=high) {
		mid=(low+high)/2;
		if(nums[mid]==target)
			return 1;
		if(target>nums[mid]) {
			low=mid+1;
		}
		else
			high=mid-1;
	}
	return -1;
}
}
