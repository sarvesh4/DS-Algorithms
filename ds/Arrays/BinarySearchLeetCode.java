package com.sarvesh.ds.Arrays;

public class BinarySearchLeetCode {
	
	int nums[] = {0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 4, 4, 4, 4, 4, 5, 5};
	int target = 4;

    public int[] searchRange(int[] nums, int target) {
        int arr[]=new int[2];
        arr[0]=-1;
        arr[1]=-1;
        int low=0;
        int high=nums.length-1;
        if(nums.length==0){
            return arr;
        }
        if(nums.length==1){
            if(nums[nums.length-1]==target){
                arr[0]=0;
                arr[1]=0;
            }
            return arr;
        }
        if(nums[0]==target){
            arr[0]=0;
        }
        else{
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target&& nums[mid-1]==target){
                    high--;
                }
                else{
                if(nums[mid]==target && nums[mid-1]!=target){
                    arr[0]=mid;
                    break;
                }
                else if(nums[mid]>target){
                    high=mid-1;
                }
                else{
                low=mid+1;
                }
                }
            }
        }
        low=0;
        high=nums.length-1;
        if(nums[nums.length-1]==target){
            arr[1]=nums.length-1;
        }
        else{
            while(low<=high){
                int mid=(low+high)/2;
                if(nums[mid]==target&& nums[mid+1]==target){
                    low++;
                }
                else{
                if(nums[mid]==target && nums[mid+1]!=target){
                    arr[1]=mid;
                    break;
                }
                else if(nums[mid]<=target){
                    low=mid+1;
                }
                else{
                high=mid-1;
                }
                }
            }
        }
        return arr;
    }
}