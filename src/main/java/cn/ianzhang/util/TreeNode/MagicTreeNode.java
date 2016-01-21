package cn.ianzhang.util.TreeNode;

/**
 * Created by Ian on 2016/1/21.
 */
public class MagicTreeNode {
    public int getMaxDepth(TreeNode root) {
        if (root != null) {
            int left = getMaxDepth(root.left);
            int right = getMaxDepth(root.right);
            return 1 + Math.max(left, right);
        } else {
            return 0;
        }
    }

    public void getElementsLDR(TreeNode root) {
        if (root != null) {
            getElementsLDR(root.left);
            System.out.println(root.val);
            getElementsLDR(root.right);
        }
    }

    public void getElementsDLR(TreeNode root) {
        if (root != null) {
            System.out.println(root.val);
            getElementsDLR(root.left);
            getElementsDLR(root.right);
        }
    }

    public void getElementsLRD(TreeNode root) {
        if (root != null) {
            getElementsLRD(root.left);
            getElementsLRD(root.right);
            System.out.println(root.val);
        }
    }

}
