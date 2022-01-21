package com.leetcode.plan20day.doublepointer;

/**
 * 
 * @author lengqie
 *给你一个链表，删除链表的倒数第 n 个结点，并且返回链表的头结点。
 */


public class RemoveNthNodeFromEndOfList {
	
	static class ListNode {
	 	int val;
	 	ListNode next;
	 	ListNode() {}
	 	ListNode(int val) { this.val = val; }
	 	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListNode h = new ListNode(1);
		ListNode p = h;
		for (int i = 2; i < 6; i++) {
			 ListNode temp = new ListNode(i);
			 p.next = temp ;
			 p = p.next;

		}
		removeNthFromEnd2(h,4);
		
		p = h;
		while (p !=null) {
			System.out.println(p.val);
			p = p.next;
		}
		
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

        ListNode p = head;
        int  len = 0;
        while(p != null){
            p = p.next;
            len ++;
        }
        int index = len -n ;
        if(index == 0)
            return head.next;
        p =head;        
        for(int i = 1;i < index ;i++){
            p = p.next;
        }
        p.next = p.next.next;
        return head;
    }
}
