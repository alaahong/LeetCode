package cn.ianzhang.No0237DeleteNodeInALinkedList;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2016/1/20.
 */
public class SolutionTest {

    @Test
    public void testDeleteNode() throws Exception {
        ListNode n1 = new ListNode(1);
        n1.next = new ListNode(2);
        n1.next.next = new ListNode(3);
        n1.next.next.next = new ListNode(4);
        Solution s = new Solution();
        s.deleteNode(n1);
        assertEquals(n1.next.next.val, 4);
    }
}