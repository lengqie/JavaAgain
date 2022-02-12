package com.leetcode.leetbook.illustrationofalgorithm;

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
}
