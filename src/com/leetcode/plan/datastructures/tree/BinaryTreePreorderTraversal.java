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
	// 递归 中后 遍历 类似
    public List<Integer> preorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	preorder(root,res);
    	return res;
    }
    public void preorder(TreeNode root,List<Integer> res) {
    	if(root == null)
    		return;
    	// 先 访问 根节点
    	res.add(root.val);
    	// 再 访问 左子树
    	preorder(root.left,res);
    	// 最后访问 右子树
    	preorder(root.right,res);
    }
    // 迭代 （用栈）
    public List<Integer> preorderTraversal2(TreeNode root) {
        ArrayList<Integer> res = new ArrayList<>();
        if (root == null)
        	return res;

        Stack<TreeNode> stack = new Stack<>();
        
    	// 先 访问 根节点
        stack.push(root);

        while (!stack.isEmpty()) {
            TreeNode curr = stack.pop();
            res.add(curr.val);
            //// 再 访问 左子树
            if (curr.right != null)
            	stack.push(curr.right);
         // 最后访问 右子树
            if (curr.left != null)
            	stack.push(curr.left);
        }
        return res;
    }
    
}
