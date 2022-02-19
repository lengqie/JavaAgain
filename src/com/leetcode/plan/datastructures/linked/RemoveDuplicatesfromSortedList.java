package com.leetcode.plan.datastructures.linked;


/**】
 * 给定一个已排序的链表的头 head ， 删除所有重复的元素，使每个元素只出现一次 。返回 已排序的链表 。
 * 
 * 题目数据保证链表已经按升序 排列
 */

public class RemoveDuplicatesfromSortedList {

	 class ListNode {
		    int val;
		    ListNode next;
		    ListNode() {}
		    ListNode(int val) { this.val = val; }
		    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

    public ListNode deleteDuplicates(ListNode head) {
    	ListNode p = head;
    	while(p != null && p.next != null) {
    		if(p.val == p.next.val) {
    			p.next = p.next.next;
    		} else {
        		p = p.next;
    		}
    	}
    	
    	return head;
    }
}
