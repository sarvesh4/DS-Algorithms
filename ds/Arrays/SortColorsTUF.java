package com.sarvesh.ds.Arrays;

import java.util.Arrays;

public class SortColorsTUF {
	
	public static void main(String[] args) {
		
		int nums[] = {2,0,2,1,1,0};
		sortColors(nums);
		System.out.println(Arrays.toString(nums));
		
	}

	private static void sortColors(int[] nums) {
		int low = 0;
		int mid = 0;
		int high = nums.length - 1;
		
		while (mid <= high) {
			
			if(nums[mid] == 0) {
				swap(nums,mid,low);
				low++;
				mid++;
			}
			else if(nums[mid] == 1) {
				mid++;
			}
			else if(nums[mid] == 2) {
				swap(nums,mid,high);
				high--;
			}
		}
		
	}

	static void swap(int[] nums, int z, int i) {
		int temp=nums[z];
		nums[z]=nums[i];
		nums[i]=temp;		
	}

}
