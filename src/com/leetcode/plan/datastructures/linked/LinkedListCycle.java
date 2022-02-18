package com.leetcode.plan.datastructures.linked;

import java.util.*;

/**
 * 给你一个链表的头节点 head ，判断链表中是否有环。

如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 

如果链表中存在环 ，则返回 true 。 否则，返回 false 。
 */
public class LinkedListCycle {

	 public class ListNode {
	     int val;
	     ListNode next;
	     ListNode(int x) { val = x; }
	 }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
    	
        while(head != null) {
        	// 有环 时 set 出现重复元素
        	// 无环 时 循环 将会 结束
        	if(!set.add(head)) {
        		return true;
        	}
        	head = head.next;
        }
    	return false;
    }
    // 快慢 指针 龟兔赛跑 题
    public boolean hasCycle2(ListNode head) {
    	ListNode fast = head, slow = head;
    	while(fast != null && fast.next != null) {
    		if (fast == slow) {
    			return true;
    		}
    		fast = fast.next.next;
    		slow = slow.next;
    	}
    	return false;
    }
}
