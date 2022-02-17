package com.leetcode.plan.datastructures.string;

import java.util.*;

/**
 * 给定一个字符串 s ，找到 它的第一个不重复的字符，并返回它的索引 。如果不存在，则返回 -1 。
 */

public class FirstUniqueCharacterinaString {
    public int firstUniqChar(String s) {
    	char[] chars = s.toCharArray();
    	
    	Map<Character,Integer> map =  new HashMap<>();
    	
    	for (int i = 0; i < chars.length; i++) {
			if(map.get(chars[i]) == null) {
				map.put(chars[i],1);
			} else {
				map.put(chars[i], map.get(chars[i]) + 1);
			}
		}
    	for (int i = 0; i < chars.length; i++) {
			if(map.get(chars[i]) == 1) {
				return i;
			}
		}
    	
    	return -1;
    }
}
