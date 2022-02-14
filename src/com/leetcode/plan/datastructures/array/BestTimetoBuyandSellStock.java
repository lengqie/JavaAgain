package com.leetcode.plan.datastructures.array;

/**
给定一个数组 prices ，它的第 i 个元素 prices[i] 表示一支给定股票第 i 天的价格。

你只能选择 某一天 买入这只股票，并选择在 未来的某一个不同的日子 卖出该股票。设计一个算法来计算你所能获取的最大利润。

返回你可以从这笔交易中获取的最大利润。如果你不能获取任何利润，返回 0 。

示例 1：

输入：[7,1,5,3,6,4]
输出：5
解释：在第 2 天（股票价格 = 1）的时候买入，在第 5 天（股票价格 = 6）的时候卖出，最大利润 = 6-1 = 5 。
     注意利润不能是 7-1 = 6, 因为卖出价格需要大于买入价格；同时，你不能在买入前卖出股票。

提示：

1 <= prices.length <= 10^5
0 <= prices[i] <= 10^4

 *
 */
public class BestTimetoBuyandSellStock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	// 暴力解法 （超时
    public int maxProfit(int[] prices) {
    	int max = 0;
    	for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if ((prices[j]-prices[i]) >max) {
					max = prices[j]-prices[i];
				}
			}
		}
    	return max;
    }
    public int maxProfit2(int[] prices) {
    	int max = 0;
    	int min = prices[0];
    	for (int i = 0; i < prices.length; i++) {
    		// 最大值 终于 当前 数据 与 前面 数据 最小值 差
    		
    		// 最小值
			if(prices[i] < min) {
				min = prices[i];
			}
			// 如果 当前 值 为 大于最小值的话 求出 差值
			// 并 早点 最大 的差
			else if ((prices[i]-min) >max) {
				max = prices[i]-min;
			}
		}
    	return max;
    }
}
