package cn.ianzhang.No0226InvertBinaryTree;

import org.junit.Test;

/**
 * Created by Ian on 2016/1/21.
 */
public class SolutionTest {

    @Test
    public void testInvertTree() throws Exception {
        TreeNode root = new TreeNode(0);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(11);
        root.left.right = new TreeNode(10);
    }
}