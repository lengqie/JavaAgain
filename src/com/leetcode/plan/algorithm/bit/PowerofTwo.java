package com.leetcode.plan.algorithm.bit;
/**
 * 给你一个整数 n，请你判断该整数是否是 2 的幂次方。如果是，返回 true ；否则，返回 false 。

如果存在一个整数 x 使得 n == 2^x ，则认为 n 是 2 的幂次方。

 */
public class PowerofTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean isPowerOfTwo(int n) {
    	if(n < 1) {
    		return false;
    	}
    	while(n %2 ==0) {
    		n /= 2;
    	}
    	return n == 1;
    }
    /**位运算思路：
     * 2^x = n 因为n 与 n-1 必然为0 比如8(1000) 7(0111)
     * 所以只要判断是否为0即可
     */
    public static boolean isPowerOfTwo2(int n) {
    	return n < 1 && (n & (n-1)) == 0;
    }
}
