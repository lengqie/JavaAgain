package com.leetcode.plan.algorithm.binary;


/**
 *  二分法
 *  注意n 的范围
 * 假设你有 n 个版本 [1, 2, ..., n]，你想找出导致之后所有版本出错的第一个错误的版本。
 * 你可以通过调用 bool isBadVersion(version) 接口来判断版本号 version 是否在单元测试中出错。
 * 实现一个函数来查找第一个错误的版本。你应该尽量减少对调用 API 的次数。
 */

public class FirstBadVersion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		firstBadVersion(1);

	}
    public static int firstBadVersion(int n) {
    	int left = 0;
    	int right = n - 1;
    	while(left < right) {
    		// 1 <= bad <= n <= 2^31 - 1
//    		int mid = (left + right) /2;
//    		int mid = left /2 + right /2;
    		int mid = left + (right - left) /2;
    		if (isBadVersion(mid)) {
				right = mid;
			} else {
				left = mid + 1;
			}
    	}
        return left;
    }
    public static boolean isBadVersion(int n) {
    	
		 return false;
	}

}
