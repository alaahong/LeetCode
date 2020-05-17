package cn.ianzhang.No0021MergeTwoLists;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Ian
 * @Date: 2020/5/17 19:01
 * @Description:
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode lastNode = null;
        List<Integer> list= new ArrayList<>();
        while(l1 != null && l2 != null){
            if(l1.val < l2.val){
                list.add(l1.val);
                l1 = l1.next;
            }else{
                list.add(l2.val);
                l2 = l2.next;
            }
        }
        if(l1 == null && l2 != null){
            while(l2 != null){
                list.add(l2.val);
                l2 = l2.next;
            }
        }
        if(l1 != null && l2 == null){
            while(l1 != null){
                list.add(l1.val);
                l1 = l1.next;
            }
        }
        for (int i = list.size()-1; i >=0 ; i--) {
            ListNode curListNode = new ListNode(list.get(i));
            curListNode.next = lastNode;
            lastNode = curListNode;
        }
        return lastNode;
    }
}
