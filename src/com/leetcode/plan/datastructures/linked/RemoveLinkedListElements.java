package com.leetcode.plan.datastructures.linked;

/**
 * 给你一个链表的头节点 head 和一个整数 val ，请你删除链表中所有满足 Node.val == val 的节点，并返回 新的头节点 。
 *
 */
public class RemoveLinkedListElements {

	 class ListNode {
		    int val;
		    ListNode next;
		    ListNode() {}
		    ListNode(int val) { this.val = val; }
		    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
    public ListNode removeElements(ListNode head, int val) {
        if (head == null)
            return head;

        ListNode flag = new ListNode(-1);
        flag.next = head;

        ListNode cur = flag;

        while(cur.next != null){
            if(cur.next.val == val ){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return flag.next;
    }
}
