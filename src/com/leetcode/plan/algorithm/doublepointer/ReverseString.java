package com.leetcode.plan.algorithm.doublepointer;

/**
 
 @author lengqie
 编写一个函数，其作用是将输入的字符串反转过来。输入字符串以字符数组 s 的形式给出。
 不要给另外的数组分配额外的空间，你必须原地修改输入数组、使用 O(1) 的额外空间解决这一问题。
 */
public class ReverseString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char[] s = new char[] {'a','b','c','d'};
		reverseString(s);
		System.out.println(s);
	}
    public static void reverseString(char[] s) {
        int len=s.length;
        int left=0;
        int right=len -1;
        while(left < right){
//            char tmp=s[left];
//            s[left]=s[right];
//            s[right]=tmp;
        	s[left] ^=s[right];
            s[right] ^=s[left];
            s[left] ^=s[right];
            left++;
            right--;
        }
    }
}
