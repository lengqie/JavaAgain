package com.leetcode.plan.algorithm.doublepointer;

/**
 *给定一个已按照 非递减顺序排列  的整数数组 numbers ，请你从数组中找出两个数满足相加之和等于目标数 target 。

函数应该以长度为 2 的整数数组的形式返回这两个数的下标值。numbers 的下标 从 1 开始计数 ，所以答案数组应当满足 1 <= answer[0] < answer[1] <= numbers.length 。

你可以假设每个输入 只对应唯一的答案 ，而且你 不可以 重复使用相同的元素。

 
示例 1：

输入：numbers = [2,7,11,15], target = 9
输出：[1,2]
解释：2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 */

public class TwoSumIIIputArrayIsSorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int[] twoSum(int[] numbers, int target) {
		int len = numbers.length;
		int left = 0;
		int right = len - 1;
		while (left <= right) {
			int sum = numbers[left] + numbers[right];
			if (sum == target) {
				return new int[]{left + 1, right + 1};
			} else if (sum > target){
				right --;
			} else {
				left ++;
			}
		}
    	return new int[2];
	}

}
