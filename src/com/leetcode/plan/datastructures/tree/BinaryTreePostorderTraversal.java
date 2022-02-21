package com.leetcode.plan.datastructures.tree;

import java.util.*;

/**
 给你二叉树的根节点 root ，返回它节点值的 后序 遍历。
 */

public class BinaryTreePostorderTraversal {
	
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
	// 递归 前中 遍历 类似
    public List<Integer> postorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	preorder(root,res);
    	return res;
    }
    public void preorder(TreeNode root,List<Integer> res) {
    	if(root == null)
    		return;
    	// 先 访问 左子树
    	preorder(root.left,res);
    	// 再 访问 右子树
    	preorder(root.right,res);
    	// 最后 访问 根节点
    	res.add(root.val);
    }
   // 迭代法
}
