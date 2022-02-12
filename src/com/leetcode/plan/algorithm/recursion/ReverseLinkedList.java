package com.leetcode.plan.algorithm.recursion;

/**
 给你单链表的头节点 head ，请你反转链表，并返回反转后的链表。
输入：head = [1,2,3,4,5]
输出：[5,4,3,2,1]
 */

public class ReverseLinkedList {
	public class ListNode {
	    int val;
	    ListNode next;
	    ListNode() {}
	    ListNode(int val) { this.val = val; }
	    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}
    public ListNode reverseList(ListNode head) {
    	if(head == null || head.next == null)
    		return head;
    	 ListNode p = reverseList(head.next);
    	 head.next.next = head;
    	 head.next = null;
    	 return p;
    }
}
