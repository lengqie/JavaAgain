package com.leetcode.plan.algorithm.bit;

/**
 编写一个函数，输入是一个无符号整数（以二进制串的形式），返回其二进制表达式中数字位数为 '1' 的个数（也被称为汉明重量）。
 输入必须是长度为 32 的 二进制串 。

 */
public class Numberof1Bits {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
    public int hammingWeight2(int n) {
    	int count = 0;
    	for (int i = 0; i < 32; i++) {
			count += n & 1;
			n >>= 1;
		}
    	return count;
    }
}
