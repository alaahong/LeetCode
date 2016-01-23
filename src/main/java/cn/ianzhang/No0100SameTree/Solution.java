package cn.ianzhang.No0100SameTree;

/**
 * Created by Ian on 2016/1/23.
 */

import cn.ianzhang.util.TreeNode.TreeNode;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean result = false;
        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb4 = new StringBuilder();
        printNodeValueDLR(p, sb1, 0);
        printNodeValueDLR(q, sb2, 0);
        printNodeValueLDR(p, sb3, 0);
        printNodeValueLDR(q, sb4, 0);
        if (sb1.toString().equals(sb2.toString()) && sb3.toString().equals(sb4.toString())) {
            result = true;
        }
        return result;
    }

    public void printNodeValueLDR(TreeNode node, StringBuilder sb, int level) {
        if (node != null) {
            printNodeValueLDR(node.left, sb, level + 1);
            sb.append(level + String.valueOf(node.val));
            printNodeValueLDR(node.right, sb, level + 2);
        }
    }

    public void printNodeValueDLR(TreeNode node, StringBuilder sb, int level) {
        if (node != null) {
            sb.append(level + String.valueOf(node.val));
            printNodeValueDLR(node.left, sb, level + 1);
            printNodeValueDLR(node.right, sb, level + 2);
        }
    }

}