package cn.ianzhang.No0002AddTwoNumbers;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Ian on 2015/12/25.
 * <p>
 * You are given two linked lists representing two non-negative numbers. The digits are stored in reverse order and each of their nodes contain a single digit. Add the two numbers and return it as a linked list.
 * <p>
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 * <p>
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 * <p>
 * 2 Kengs:
 * 1. we should use long to avoid the out of range, such as [1999999999] + [9]
 * 2. we should assume the they have different size such as [123] + [0]
 */
public class Solution1 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        }
        long i = parseToLong(l1);
        long j = parseToLong(l2);
        return parseToListNode(i + j);
    }

    protected ListNode parseToListNode(long n) {
        ListNode ln = null;
        ListNode lnNext = null;
        ListNode lnTemp = null;
        List<Long> list = new ArrayList<Long>();
        while (n >= 0) {
            long temp = n % 10;
            list.add(temp);
            if (ln == null) {
                ln = new ListNode(Integer.valueOf(Long.toString(temp)));
                lnTemp = ln;
            } else {
                lnNext = new ListNode(Integer.valueOf(Long.toString(temp)));
                lnTemp.next = lnNext;
                lnTemp = lnNext;
            }
            if (n >= 10) {
                n = n / 10;
            } else {
                n = -1;
            }
        }
        return ln;
    }

    protected long parseToLong(ListNode ln) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(ln.val);
        while (ln.next != null) {
            ln = ln.next;
            list.add(ln.val);
        }
        long result = 0;
        for (int i = list.size() - 1; i >= 0; i--) {
            result = result + list.get(i) * getMulti10(i);
        }
        return result;
    }

    protected long getMulti10(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result = 10 * result;
        }
        return result;
    }
}
