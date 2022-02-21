package com.leetcode.plan.datastructures.tree;

import java.util.*;

/**
 给你二叉树的根节点 root ，返回它节点值的 前序 遍历。
 */

public class BinaryTreePreorderTraversal {
	
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
	 
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	preorder(root,res);
    	return res;
    }
    public void preorder(TreeNode root,List<Integer> res) {
    	if(root == null)
    		return;
    	// 
    	res.add(root.val);
    	preorder(root.left,res);
    	preorder(root.right,res);
    }
}
