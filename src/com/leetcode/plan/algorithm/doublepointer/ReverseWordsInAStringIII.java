package com.leetcode.plan.algorithm.doublepointer;

/**
 * 
 * @author lengqie
 * 给定一个字符串，你需要反转字符串中每个单词的字符顺序，同时仍保留空格和单词的初始顺序。
 */

public class ReverseWordsInAStringIII {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s  = "Let's take LeetCode contest";
		System.out.println(reverseWords2(s));
	}
	// 借鉴了 Reverse String
    public static String reverseWords(String s) {
    	String[] a = s.split(" ");
    	String result = "";
    	for (String i : a) {
			char[] c = i.toCharArray();
	        int len=c.length;
	        int left=0;
	        int right=len -1;
	        while(left < right){
	        	c[left] ^=c[right];
	            c[right] ^=c[left];
	            c[left] ^=c[right];
	            left++;
	            right--;
	        }
	        result += String.valueOf(c);
	        result += " ";
		}
    	return result.trim();
    }
    //
    public static String reverseWords2(String s) {
    	String[] strs = s.split(" ");
    	StringBuffer buffer = new StringBuffer();
    	for (int i = 0; i < strs.length; i++) {
    		buffer.append(new StringBuffer(strs[i]).reverse().toString());
    		buffer.append(" ");
    	}
    	return buffer.toString().trim();
	}
}
