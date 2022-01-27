package com.leetcode.plan.algorithm.bfsanddfs;
import java.util.*;
/**
 * 
 * 在给定的 m x n 网格 grid 中，每个单元格可以有以下三个值之一：

值 0 代表空单元格；
值 1 代表新鲜橘子；
值 2 代表腐烂的橘子。
每分钟，腐烂的橘子 周围 4 个方向上相邻 的新鲜橘子都会腐烂。

返回 直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1 。
 *
 */
public class RottingOranges {

	static int[][] dirs = new int[][]{{0,1},{0,-1},{1,0},{-1,0}};
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public static int orangesRotting(int[][] grid) {
    	int m  = grid.length;
    	int n = grid[0].length;
    	Queue<int[]> queue = new LinkedList<>();
    	
    	int count = 0;
    	for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				if (grid[i][j] == 2) {
					queue.add(new int[] {i,j});
				} else if (grid[i][j]== 1) {
					count++;
				}
			}
    	}
    	int result = 0;
    	while(count > 0 && !queue.isEmpty()) {

    		int len = queue.size();
    		for (int i = 0; i < len; i++) {
        		int[] cell = queue.poll();
        		int dx = cell[0];
        		int dy = cell[1];
        		
        		for (int[] dir : dirs) {
    				int nx = dx + dir[0];
    				int ny = dy + dir[1];
    				if(nx >= 0 && nx < m && ny >= 0 && ny < n && grid[nx][ny] == 1) {
    					grid[nx][ny] = 2;
    					count --;
    					queue.add(new int[]{nx,ny});
    				}
    			}
			}
    		result ++;

    	}
    	if(count != 0) {
    		return -1;
    	}
    	return result;
    }
}
