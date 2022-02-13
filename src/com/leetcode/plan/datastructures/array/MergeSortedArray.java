package com.leetcode.plan.datastructures.array;

import java.util.Arrays;

/**
 * 给你两个按 非递减顺序 排列的整数数组 nums1 和 nums2，另有两个整数 m 和 n ，分别表示 nums1 和 nums2 中的元素数目。

请你 合并 nums2 到 nums1 中，使合并后的数组同样按 非递减顺序 排列。

注意：最终，合并后数组不应由函数返回，而是存储在数组 nums1 中。

为了应对这种情况，nums1 的初始长度为 m + n，其中前 m 个元素表示应合并的元素，后 n 个元素为 0 ，应忽略。nums2 的长度为 n 。

 *
 */

public class MergeSortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		merge2(new int[] {1,2,3,0,0,0},3,new int[] {2,5,6},3);
	}
    public void merge(int[] nums1, int m, int[] nums2, int n) {
    	for (int i = 0; i < nums1.length; i++) {
    		if(i >= m) {
    			nums1[i] = nums2[i - m];
    		}
		}
    	Arrays.sort(nums1);
    }
    // 双指针
    public static void merge2(int[] nums1, int m, int[] nums2, int n) {
    	int[] ans = new int[m + n];
    	int p1 = 0;
    	int p2 = 0;
    	int i = 0;
    	while(p1 < m || p2 <n) {
    		// 如何 p1 已经到末尾 则 添加 依次 剩余 nums2 到 ans
    		if(p1 == m) {
    			ans[i] = nums2[p2++];
    		}// 如何 p2 已经到末尾 则 添加  依次  剩余 nums1 到 ans
    		else if (p2 == n) {
    			ans[i] = nums1[p1++];
    		}
    		// 将小的 添加到 ans
    	   else if(nums1[p1] < nums2[p2]) {
    			ans[i] = nums1[p1++];
    		} else {
    			ans[i] = nums2[p2++];
    		}
    		i ++;
    	}
    	for (int j = 0; j < ans.length; j++) {
    		nums1[j] = ans[j];
		}
    }
}
