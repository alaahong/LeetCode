package cn.ianzhang.No0217ContainsDuplicate;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testContainsDuplicate() throws Exception {
        Solution s = new Solution();
        assertFalse(s.containsDuplicate(new int[]{}));
        assertFalse(s.containsDuplicate(new int[]{0}));
        assertFalse(s.containsDuplicate(new int[]{0, 1}));
        assertTrue(s.containsDuplicate(new int[]{1, 1}));
        assertTrue(s.containsDuplicate(new int[]{1, 1, 2}));
        assertTrue(s.containsDuplicate(new int[]{1, 2, 3, 4, 5, 5}));
    }
}