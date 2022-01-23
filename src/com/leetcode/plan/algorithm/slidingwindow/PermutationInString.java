package com.leetcode.plan.algorithm.slidingwindow;

/**
 * 字符串的排列
给你两个字符串 s1 和 s2 ，写一个函数来判断 s2 是否包含 s1 的排列。如果是，返回 true ；否则，返回 false 。

换句话说，s1 的排列之一是 s2 的 子串 。

示例 1：

输入：s1 = "ab" s2 = "eidbaooo"
输出：true
解释：s2 包含 s1 的排列之一 ("ba").
示例 2：

输入：s1= "ab" s2 = "eidboaoo"
输出：false
 */
public class PermutationInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static boolean checkInclusion(String s1, String s2) {
    	 char[] pattern = s1.toCharArray();
         char[] text = s2.toCharArray();

         int pLen = s1.length();
         int tLen = s2.length();

         int[] pFreq = new int[26];
         int[] winFreq = new int[26];

         for (int i = 0; i < pLen; i++) {
             pFreq[pattern[i] - 'a']++;
         }

         int pCount = 0;
         for (int i = 0; i < 26; i++) {
             if (pFreq[i] > 0){
                 pCount++;
             }
         }

         int left = 0;
         int right = 0;
         // 当滑动窗口中的某个字符个数与s1中对应相等的时候才计数
         int winCount = 0;
         while (right < tLen){
             if (pFreq[text[right] - 'a'] > 0 ) {
                 winFreq[text[right] - 'a']++;
                 if (winFreq[text[right] - 'a'] == pFreq[text[right] - 'a']){
                     winCount++;
                 }
             }
             right++;

             while (pCount == winCount){
                 if (right - left == pLen){
                     return true;
                 }
                 if (pFreq[text[left] - 'a'] > 0 ) {
                     winFreq[text[left] - 'a']--;
                     if (winFreq[text[left] - 'a'] < pFreq[text[left] - 'a']){
                         winCount--;
                     }
                 }
                 left++;
             }
         }
    	return false;
    }
    //计算hash值
    //时间复杂度为O(n)地遍历s2
    public static boolean checkInclusion2(String s1, String s2) {
        String temp;
        int h1 = hash_Code(s1);
        for(int i =0;  i <= s2.length() - s1.length();i++) {
        	temp = s2.substring(i,i+ s1.length());
        	if (hash_Code(temp) == h1) {
        		return true;
        	}
        }
        return false;
    }

    public static int hash_Code(String s) {
        int code = 0;
        char[] c = s.toCharArray();
        for (char d : c) {
			code += ((int) d) * ((int)d); 
		}
        return code;
    }
}
