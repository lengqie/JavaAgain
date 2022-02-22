package com.leetcode.plan.datastructures.tree;

import java.util.*;

/**
 * 给你二叉树的根节点 root ，返回其节点值的 层序遍历 。 （即逐层地，从左到右访问所有节点）。
 
 输入：root = [3,9,20,null,null,15,7]

输出：[[3],[9,20],[15,7]]
 */

public class BinaryTreeLevelOrderTraversal {
	 public class TreeNode {
	     int val;
	     TreeNode left;
	     TreeNode right;
	     TreeNode() {}
	     TreeNode(int val) { this.val = val; }
	     TreeNode(int val, TreeNode left, TreeNode right) {
	         this.val = val;
	         this.left = left;
	         this.right = right;
	     }
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public List<List<Integer>> levelOrder(TreeNode root) {
    	 List<List<Integer>> res = new ArrayList<List<Integer>>();
         if (root == null) {
             return res;
         }
         Queue<TreeNode> queue = new LinkedList<TreeNode>();
         // 首先根元素入队
         queue.offer(root);
         while (!queue.isEmpty()) {
             List<Integer> level = new ArrayList<Integer>();
             // 每一层的 节点数
             int currentLevelSize = queue.size();
             // 将 每一层 节点 的 子节点 入队
             for (int i = 1; i <= currentLevelSize; ++i) {
                 TreeNode node = queue.poll();
                 level.add(node.val);
                 if (node.left != null) {
                     queue.offer(node.left);
                 }
                 if (node.right != null) {
                     queue.offer(node.right);
                 }
             }
             res.add(level);
         }
         return res;
    }
}
