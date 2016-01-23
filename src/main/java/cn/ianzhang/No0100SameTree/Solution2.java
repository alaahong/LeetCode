package cn.ianzhang.No0100SameTree;

import cn.ianzhang.util.TreeNode.TreeNode;

/**
 * Created by Ian on 2016/1/23.
 */
public class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;

        } else if (p != null && q == null) {
            return false;
        } else if (p == null && q != null) {
            return false;
        } else if (p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
    }
}