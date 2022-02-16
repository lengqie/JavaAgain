package com.leetcode.plan.datastructures.array;

import java.util.*;

/**
 * 给定一个非负整数 numRows，生成「杨辉三角」的前 numRows 行。

在「杨辉三角」中，每个数是它左上方和右上方的数的和。

 */
public class PascalsTriangle {
    public List<List<Integer>> generate(int numRows) {
    	
        List<List<Integer>> ans = new ArrayList<List<Integer>>();
        
        for (int i = 0; i < numRows; i ++) {
        	
            List<Integer> row = new ArrayList<Integer>();
            
            for (int j = 0; j <= i; j ++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(ans.get(i - 1).get(j - 1) + ans.get(i - 1).get(j));
                }
            }
            ans.add(row);
        }
        return ans;
    }
}
