package cn.ianzhang.No0100SameTree;

import cn.ianzhang.util.TreeNode.TreeNode;
import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ian on 2016/1/23.
 */
public class SolutionTest {

    @Test
    public void testIsSameTree() throws Exception {
        Solution s = new Solution();
        TreeNode n1 = new TreeNode(11);
        n1.left = new TreeNode(1110);
        TreeNode n2 = new TreeNode(22);
        n2.right = new TreeNode(2202);
        assertFalse(s.isSameTree(n1, n2));
        assertTrue(s.isSameTree(new TreeNode(1), new TreeNode(1)));
    }
}