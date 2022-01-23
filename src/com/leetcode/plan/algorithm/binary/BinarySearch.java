/**
 * 二分查找
 * 给定一个 n 个元素有序的（升序）整型数组 nums 和一个目标值 target，
 * 写一个函数搜索 nums 中的 target，
 * 如果目标值存在返回下标，否则返回 -1。 
 */

package com.leetcode.plan.algorithm.binary;

public class BinarySearch {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,5,6,7,8};
		System.out.println(search(nums, 4));
		System.out.println(search(nums, 5));
	}
	
    public static int search(int[] nums, int target) {
    	int left = 0;
    	int right = nums.length -1;
    	
    	while (left <= right) {
			int mid = (left + right) / 2;
			if (nums[mid] > target) {
				right = mid - 1;
			} else if (nums[mid] < target) {
				left = mid + 1;
			} else {
				return mid;
			}
		}
    	return -1;
    }
}
