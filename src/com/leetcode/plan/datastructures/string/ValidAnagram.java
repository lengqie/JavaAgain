package com.leetcode.plan.datastructures.string;

/**
 *  有效的字母异位词
给定两个字符串 s 和 t ，编写一个函数来判断 t 是否是 s 的字母异位词。

注意：若 s 和 t 中每个字符出现的次数都相同，则称 s 和 t 互为字母异位词。
 */

public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
    	int[] count = new int[26];
    	
    	for (int i = 0; i < s.length(); i++) {
			count[s.charAt(i) - 'a'] ++;
		}
    	
    	for (int i = 0; i < t.length(); i++) {
			count[t.charAt(i) - 'a'] --;
		}
    	
    	for (int i = 0; i < count.length; i++) {
			if(count[i] != 0) return false;
		}
    	return true;
    }
}
