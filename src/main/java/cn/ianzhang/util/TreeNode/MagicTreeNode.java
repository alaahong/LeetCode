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

    public void printNodeValueLDR(TreeNode node, StringBuilder sb) {
        if (node != null) {
            printNodeValueLDR(node.left, sb);
            sb.append(String.valueOf(node.val));
            printNodeValueLDR(node.right, sb);
        }
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
