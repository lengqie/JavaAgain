package com.leetcode.plan.datastructures.array;

import java.util.*;

/**
 * 给你两个整数数组 nums1 和 nums2 ，请你以数组形式返回两数组的交集。
 * 返回结果中每个元素出现的次数，应与元素在两个数组中都出现的次数一致（如果出现次数不一致，则考虑取较小值）。
 * 可以不考虑输出结果的顺序。
示例 1：

输入：nums1 = [1,2,2,1], nums2 = [2,2]
输出：[2,2]
 *
 */

public class IntersectionofTwoArraysII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public int[] intersect(int[] nums1, int[] nums2) {
    	List<Integer> list1 = new ArrayList<>();
    	for (Integer num : nums1) {
			list1.add(num);
		}
    	List<Integer> list2 = new ArrayList<>();
    	for (int num : nums2) {
			if (list1.contains(num)) {
				list2.add(num);
				list1.remove(Integer.valueOf(num));
			}
		}
    	int[] ans = new int[list2.size()];
    	int i = 0;
    	for (Integer integer : list2) {
			ans[i ++] = integer;
		}
    	return ans;
    }

}
