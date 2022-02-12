package com.leetcode.plan.datastructures.array;

/**
 最大子数组和
给你一个整数数组 nums ，请你找出一个具有最大和的连续子数组（子数组最少包含一个元素），返回其最大和。
子数组 是数组中的一个连续部分。

示例 1：

输入：nums = [-2,1,-3,4,-1,2,1,-5,4]
输出：6
解释：连续子数组 [4,-1,2,1] 的和最大，为 6 。

 *
 */

public class MaximumSubarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int maxSubArray(int[] nums) {
    	int ans = nums[0];
    	int sum = 0;
    	// 贪心算法
    	for (int i : nums) {
    		// 如果 sum 对结果有增益效果 
			if(sum > 0) {
				sum += i;
			} 
			//  sum 对结果无增益效果，需要舍弃 sum 重新 计算
			else {
				sum = i;
			}
			ans = Math.max(sum,ans);
		}
    	return ans;
    }
}
