package com.leetcode.plan.algorithm.dp;
/** 
假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
输入：n = 3
输出：3
解释：有三种方法可以爬到楼顶。
1. 1 阶 + 1 阶 + 1 阶
2. 1 阶 + 2 阶
3. 2 阶 + 1 阶
 * 
 */
public class ClimbingStairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 斐波那契？？
	public int climbStairs(int n) {
	    int[] dp = new int[n + 1];
	    dp[0] = 1;
	    dp[1] = 1;
	    for (int i = 2; i <= n; i++) {
	        dp[i] = dp[i - 1] + dp[i - 2];
	    }
	    return dp[n];
	}
}
