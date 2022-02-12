package com.leetcode.plan.algorithm.doublepointer;

import java.util.Arrays;

/**
 有序数组的平方
 给你一个按 非递减顺序 排序的整数数组 nums，返回 每个数字的平方 组成的新数组，要求也按 非递减顺序 排序。
 */

public class SquaresOfaSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i : sortedSquares(new int[] {-3,-1,2,12,33} ) ) {
		    System.out.println(i);
		}
	}
	public static int[] sortedSquares(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
			nums[i] *= nums[i];
		}
		Arrays.sort(nums);
		return nums;
	}
	// double pointer
	public static int[] sortedSquares2(int[] nums) {
		int left = 0;
		int right = nums.length - 1;
		int index = right;
		int[] result = new int[nums.length];
		while(left <= right) {
			if (nums[left] nums[left] > nums[right] nums[right]) {
				result[index --] = nums[left] nums[left ++];
//				index --;
//				left ++;
			} else {
				result[index --] = nums[right] nums[right ++];
//				index --;
//				right --;
			}
		}
		return result;
	}
	
}
