package com.leetcode.easy.doublepointer;

/**
 * 
 * @author lengqie
 *给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */


public class RemoveNthNodeFromEndOfList {
	
	class ListNode {
	 	int val;
	 	ListNode next;
	 	ListNode() {}
	 	ListNode(int val) { this.val = val; }
	 	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ListNode l = new ListNode();
	}
    public static ListNode removeNthFromEnd(ListNode head, int n) {
    	ListNode fast = head;
    	ListNode slow = head;
    	
    	for (int i = 0; i < n; i++) {
			fast = fast.next;
		}

    	while(fast.next !=null){
            fast=fast.next;
            slow=slow.next;
        }
    	
        slow.next=slow.next.next;
        return head;

    }
    public static ListNode removeNthFromEnd2(ListNode head, int n) {
    	int len = 0;
    	ListNode p = head;
    	while (p.next != null) {
			p = p.next;
			len ++;
		}
    	p = head;
    	int i =0;
    	while(p.next != null) {
    		if (i == (len + 1 - n)) {
    			p.next =p.next.next;
    		}
    		i ++;
    		p = p.next;
    	}
    	return p;
    }
}
