package cn.ianzhang.No0002AddTwoNumbers;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2015/12/26.
 */
public class Solution1Test {

    @Test
    public void testAddTwoNumbers() throws Exception {
        ListNode l1 = new ListNode(0);
        ListNode l2 = new ListNode(0);
        assertEquals(new ListNode(0).val, new Solution1().addTwoNumbers(l1, l2).val);
    }

    @Test
    public void testParseValue() {
        Solution1 s = new Solution1();
        assertEquals(s.parseToLong(s.parseToListNode(9999999991L)), 9999999991L);
    }
}