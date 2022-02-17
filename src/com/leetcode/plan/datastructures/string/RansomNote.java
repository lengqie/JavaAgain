package com.leetcode.plan.datastructures.string;

/**
 * 给你两个字符串：ransomNote 和 magazine ，判断 ransomNote 能不能由 magazine 里面的字符构成。

如果可以，返回 true ；否则返回 false 。

magazine 中的每个字符只能在 ransomNote 中使用一次。
 */
public class RansomNote {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean canConstruct(String ransomNote, String magazine) {
    	int[] count = new int[26];
    	for (int i = 0; i < magazine.length(); i++) {
    		count[magazine.charAt(i) - 'a'] ++;
		}
    	
    	for (int i = 0; i < ransomNote.length(); i++) {
    		count[ransomNote.charAt(i) - 'a'] --;
		}
    	
    	for (int i = 0; i < ransomNote.length(); i++) {
    		if( count[ransomNote.charAt(i) - 'a'] <0 ) {
    			return false;
    		}
		}
    	return true;
    }
}
