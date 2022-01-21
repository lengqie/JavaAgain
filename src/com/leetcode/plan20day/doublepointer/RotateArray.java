package com.leetcode.plan20day.doublepointer;

import java.util.Arrays;

/**
 * 轮转数组
 * 给你一个数组，将数组中的元素向右轮转 k 个位置，其中 k 是非负数。
 * 输入: nums = [1,2,3,4,5,6,7], k = 3
 * 输出: [5,6,7,1,2,3,4]
 * 解释:
 * 向右轮转 1 步: [7,1,2,3,4,5,6]
 * 向右轮转 2 步: [6,7,1,2,3,4,5]
 * 向右轮转 3 步: [5,6,7,1,2,3,4]
 */
public class RotateArray {
	public static void main(String[] args) {
		int[] nums = new int[] {1,2,3,4,5,6,7};
		int k = 3;
		
		rotate(nums,k);
		System.out.println(Arrays.toString(nums));
	}
    public static void rotate(int[] nums, int k) {
    	int len = nums.length;
    	int[] temp = new int[len];
    	// 备份数组
    	for(int i = 0;i < len; i++) {
    		temp[i] = nums[i];
    	}
    	//移动数组
    	// 即 i =0 时候 移动到  位置  k
    	// 	i = n 移动到 k + n 
    	//	k + m >= length 时 移动到 位置  0~k - 1
    	for(int i = 0; i < len; i++) {
    		nums[(i + k ) % len] = temp[i];
    	}
    }
    
    public static void rotate2(int[] nums, int k) {
    	int len = nums.length;
    	// k 大于 len 时候 k = k - len
    	k %= len;
    	// 全部反转 [7,6,5,4,3,2,1]
    	reverse(nums,0,len -1);
    	// 还原 前部分 [5,6,7,4,3,2,1]
    	reverse(nums,0,k -1);
    	// 还原后部分 [5,6,7,1,2,3,4]
    	reverse(nums,k, len -1);
	}
    public static void reverse(int[] nums, int start,int end) {
		while (start < end) {
			int temp = nums[start];
			nums[start] = nums[end];
			nums[end] = temp;
			
			start ++;
			end --;
		}
	}
}
