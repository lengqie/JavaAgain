package com.leetcode.plan.algorithm.doublepointer;

import java.util.Arrays;

/**
给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。

示例:

输入: [0,1,0,3,12]
输出: [1,3,12,0,0]
说明:

必须在原数组上操作，不能拷贝额外的数组。
尽量减少操作次数。
 */
public class MoveZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int[] nums = new int[] {0,1,0,3,12};
		int[] nums = new int[] {0,0,1};
		moveZeroes2(nums);
		System.out.println(Arrays.toString(nums));
	}
    public static void moveZeroes(int[] nums) {
    	int zero =0;
    	for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				zero ++;
			} else {
				nums[i -zero] = nums[i];
			}
		}
    	for (int i = 0; i < zero; i++) {
			nums[nums.length -1 - i] = 0;
		}
    }
    
    // 快慢 指针
    public static void moveZeroes2(int[] nums) {
    	int fast = 0;
    	int slow = 0;
    	while (fast < nums.length) {
    		if (nums[fast] !=0) {
				nums[slow] = nums[fast];
    			slow ++;
			}
    		fast ++;
		}
    	while (slow < nums.length) {
			nums[slow] = 0;
			slow ++;
		}
    }
    
    // 前后指针  (当 出现连续 0时 存在 数据损失的问题)
    @Deprecated
    public static void moveZeroes3(int[] nums) {
    	int left = 0;
    	int right = nums.length - 1;
    	
    	while (left < right) {
			if (nums[left] == 0) {
				// 如果发现 0  就将 前后指针直接的数值 整体前移 一格
				for (int i = left; i < right; i++) {
					nums[i] = nums[i + 1];
				}
				right --;
			}
			left ++;
		}

    	while (right < nums.length -1) {
			nums[right + 1] = 0;
			right ++;
		}
    }
}
