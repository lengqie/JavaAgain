package com.leetcode.easy.doublepointer;

/**
 * 
 * @author lengqie
 *给定一个头结点为 head 的非空单链表，返回链表的中间结点。
 *如果有两个中间结点，则返回第二个中间结点。
 */
class ListNode {
 	int val;
 	ListNode next;
 	ListNode() {}
 	ListNode(int val) { this.val = val; }
 	ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class MiddleOfTheLinkedList {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ListNode l = new ListNode();
		System.out.println(5 >> 1);
		System.out.println(6 >> 1); 
	}
	
	// 快慢指针
    public static ListNode middleNode(ListNode head) {
    	ListNode fast = head;
    	ListNode slow = head;
    	// fsat.next != null  防止 fast.next.next
    	while (fast !=null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
    	return slow;
    }
    
    // index
    public static ListNode middleNode2(ListNode head) {
    	ListNode p = head;
    	int index = 0;
    	while (p != null) {
			p = p.next;
			index ++;
		}
    	p = head;
    	int mid = index / 2;
    	for (int i = 0;i < mid; i++) {
			p = p.next;
		}
    	return p;
    }
}
