package com.leetcode.easy.doublepointer;

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
