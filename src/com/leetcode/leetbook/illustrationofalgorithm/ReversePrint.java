package com.leetcode.leetbook.illustrationofalgorithm;

import java.util.ArrayList;
import java.util.List;

/**
 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 */
public class ReversePrint {

	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
    public int[] reversePrint(ListNode head) {
    	int len = 0;
    	ListNode current = head;
    	while(current != null) {
    		len += 1;
    		current = current.next;
    	}
    	int[] arr = new int[len];
    	for (int i = len - 1; i >= 0; i--) {
			arr[i] = head.val;
			head = head.next;
		}
    	return arr;
    }
    // 递归
    List<Integer> list = new ArrayList<Integer>();
    public int[] reversePrint2(ListNode head) {
    	recursion(head);
    	int[] arr = new int[list.size()];
    	for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
    	return arr;
    }
    public void recursion(ListNode head) {
    	if(head == null) {
    		return;
    	}
    	recursion(head.next);
    	list.add(head.val);
    }
}
