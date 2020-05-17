package cn.ianzhang.No0021MergeTwoLists;

/**
 * @Author: Ian
 * @Date: 2020/5/17 19:01
 * @Description:
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode head = new ListNode(-1);
        ListNode curNode = head;
        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                curNode.next = l1;
                l1 = l1.next;
            } else {
                curNode.next = l2;
                l2 = l2.next;
            }
            curNode = curNode.next;
        }
        if (l1 == null) {
            curNode.next = l2;
        }
        if (l2 == null) {
            curNode.next = l1;
        }
        return head.next;
    }
}
