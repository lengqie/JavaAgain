package com.leetcode.plan20day.slidingwindow;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
示例 1:

输入: s = "abcabcbb"
输出: 3 
解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
示例 2:
 */
public class LongestSubstringWithoutRepeatingCharacters {
	public static void main(String[] args) {
//		System.out.println(lengthOfLongestSubstring("aab"));
		System.out.println(Arrays.toString("bb".split("b")));
	}
    public static int lengthOfLongestSubstring(String s) {
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max = 0;
        int left = 0;
        for(int i = 0; i < s.length(); i ++){
            if(map.containsKey(s.charAt(i))){
                left = Math.max(left,map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-left+1);
        }
        return max;
    }
    // 暴力 超出时间限制
    public static int lengthOfLongestSubstring1(String s) {
            int n = s.length();
            if (n <= 1) return n;
            int maxLen = 1;
            for (int i = 0; i < n; i++) {
                for (int j = i + 1; j < n; j++) {
                    if (allUnique(s, i, j)) {
                        maxLen = Math.max(maxLen, j - i + 1);
                    }
                }
            }
            return maxLen;
    }
    public static boolean allUnique(String s, int start, int end) {
        Set<Character> set = new HashSet<>();
        for (int i = start; i <= end; i++) {
            if (set.contains(s.charAt(i))) {
                return false;
            }
            set.add(s.charAt(i));
        }
        return true;
    }
    
    public int lengthOfLongestSubstring2(String s) {
	    int n = s.length();
	    if (n <= 1) return n;
	    int maxLen = 1;
	
	    int left = 0, right = 0;
	    Set<Character> window = new HashSet<>();
	    while (right < n) {
	        char rightChar = s.charAt(right);
	        while (window.contains(rightChar)) {
	            window.remove(s.charAt(left));
	            left++;
	        }
	        maxLen = Math.max(maxLen, right - left + 1);
	        window.add(rightChar);
	        right++;
	    }
	    return maxLen;
    }
}
