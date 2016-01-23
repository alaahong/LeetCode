package cn.ianzhang.No0104MaximumDepthofBinaryTree;

import cn.ianzhang.util.TreeNode.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2016/1/20.
 */
public class SolutionTest {
    @Test
    public void testMaxDepth() throws Exception {
        TreeNode root = new TreeNode(1);
        root.left = generateOneHand(true, 10);
        root.left = generateOneHand(false, 15);
        Solution s = new Solution();
        assertEquals(s.maxDepth(root), 16);
    }

    private TreeNode generateOneHand(boolean leftHand, int depth) {
        TreeNode tree = new TreeNode(1);
        TreeNode resultTree = tree;
        for (int i = 0; i < depth - 1; i++) {
            if (leftHand) {
                tree.left = new TreeNode(1);
                tree = tree.left;
            } else {
                tree.right = new TreeNode(1);
                tree = tree.right;
            }
        }
        return resultTree;
    }
}