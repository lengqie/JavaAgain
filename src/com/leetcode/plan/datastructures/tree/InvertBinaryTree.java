package com.leetcode.plan.datastructures.tree;

/**
 * 给你一棵二叉树的根节点 root ，翻转这棵二叉树，并返回其根节点。
 *
 */

public class InvertBinaryTree {

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
	
    public TreeNode invertTree(TreeNode root) {
    	if(root == null) {
    		return null;
    	}
    	TreeNode left = invertTree(root.left);
    	TreeNode right = invertTree(root.right);
    	
    	root.left = right;
    	root.right = left;
    	
    	return root;
    }
}
