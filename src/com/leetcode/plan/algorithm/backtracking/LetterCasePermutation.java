package com.leetcode.plan.algorithm.backtracking;

import java.util.*;
/**
 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
示例：
输入：S = "a1b2"
输出：["a1b2", "a1B2", "A1b2", "A1B2"]

输入：S = "3z4"
输出：["3z4", "3Z4"]

输入：S = "12345"
输出：["12345"]
 @author lengqie
 *
 */
public class LetterCasePermutation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	public List<String> letterCasePermutation(String S) {
	    List<StringBuilder> ans = new ArrayList();
	    ans.add(new StringBuilder());
	
	    for (char c: S.toCharArray()) {
	        int n = ans.size();
	        if (Character.isLetter(c)) {
	            for (int i = 0; i < n; ++i) {
	                ans.add(new StringBuilder(ans.get(i)));
	                ans.get(i).append(Character.toLowerCase(c));
	                ans.get(n+i).append(Character.toUpperCase(c));
	            }
	        } else {
	            for (int i = 0; i < n; ++i)
	                ans.get(i).append(c);
	        }
	    }
	
	    List<String> finalans = new ArrayList();
	    for (StringBuilder sb: ans)
	        finalans.add(sb.toString());
	    return finalans;
	}
}
