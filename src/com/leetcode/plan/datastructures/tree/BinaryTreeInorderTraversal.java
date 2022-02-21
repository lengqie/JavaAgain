package com.leetcode.plan.datastructures.tree;

import java.util.*;

/**
 给你二叉树的根节点 root ，返回它节点值的 中序 遍历。
 */

public class BinaryTreeInorderTraversal {
	
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
	// 递归 前后 遍历 类似
    public List<Integer> inorderTraversal(TreeNode root) {
    	List<Integer> res = new ArrayList<Integer>();
    	preorder(root,res);
    	return res;
    }
    public void preorder(TreeNode root,List<Integer> res) {
    	if(root == null)
    		return;
    	// 先 访问 左子树
    	preorder(root.left,res);
    	// 再 访问 根节点
    	res.add(root.val);
    	// 最后访问 右子树
    	preorder(root.right,res);
    }
    // 迭代 （用栈）
    public List<Integer> inorderTraversal2(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null)
        	return res;

        Stack<TreeNode> stack = new Stack<>();
        while (root != null || !stack.isEmpty()) {
        	// 先 访问 左子树
            while (root != null) {
                stack.push(root);
                root = root.left;
            }
            TreeNode node = stack.pop();
            // 再 访问 根节点
            res.add(node.val);
            // 最后访问 右子树
            root = node.right;
        }
        return res;
    }
    
}
