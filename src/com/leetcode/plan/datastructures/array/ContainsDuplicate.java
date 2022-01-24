/**
 * 存在重复元素
 * 给定一个整数数组，判断是否存在重复元素。
 * 如果存在一值在数组中出现至少两次，函数返回 true 。如果数组中每个元素都不相同，则返回 false 。
 * 示例 1:
 *
 * 输入: [1,2,3,1]
 * 输出: true
 */
package com.leetcode.plan.datastructures.array;

import java.util.Arrays;
import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        containsDuplicate2(new int[]{1,2,3,4});
    }
    public static boolean containsDuplicate(int[] nums){
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]){
                return false;
            }
        }
        return true;
    }
    public static boolean containsDuplicate2(int[] nums){
        HashSet<Integer> hashSet = new HashSet<>();
        for (int n : nums) {
            hashSet.add(n);
        }
        return hashSet.size() != nums.length;
    }
}
