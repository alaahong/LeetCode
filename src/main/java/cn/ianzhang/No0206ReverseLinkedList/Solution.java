package cn.ianzhang.No0206ReverseLinkedList;

import cn.ianzhang.util.TreeNode.ListNode;

/**
 * Created by Ian on 2016/1/26.
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode cur = null;
        ListNode temp = head;
        ListNode pre = null;
        while (temp != null) {
            pre = cur;
            cur = temp;
            temp = cur.next;
            cur.next = pre;
        }
        return cur;
    }
}

