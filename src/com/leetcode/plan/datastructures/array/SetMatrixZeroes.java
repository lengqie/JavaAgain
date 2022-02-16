package com.leetcode.plan.datastructures.array;

import java.util.*;

/**
 * 给定一个 m x n 的矩阵，如果一个元素为 0 ，则将其所在行和列的所有元素都设为 0 。请使用 原地 算法。
 *
 */
public class SetMatrixZeroes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public void setZeroes(int[][] matrix) {
    	
    	// 
    	Set<Integer> row = new HashSet<>();
    	Set<Integer> col = new HashSet<>();
    	
    	int m = matrix.length;
    	int n = matrix[0].length;
    	
    	for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if(matrix[i][j] == 0) {
					row.add(i);
					col.add(j);
				}
			}
		}
    	
    	for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if(row.contains(i) || col.contains(j)) {
					matrix[i][j] = 0;
				}
			}
		}
    	    	
    }
}
