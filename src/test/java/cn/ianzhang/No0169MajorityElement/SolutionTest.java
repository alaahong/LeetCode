package cn.ianzhang.No0169MajorityElement;

import junit.framework.TestCase;

public class SolutionTest extends TestCase {

    public void testMajorityElement() throws Exception {
        Solution s = new Solution();
        assertEquals(1, s.majorityElement(new int[]{1, 2, 1}));
        assertEquals(1, s.majorityElement(new int[]{1, 2, 1, 3, 1}));
        assertEquals(1, s.majorityElement(new int[]{1, 2, 1, 1}));
        assertEquals(1, s.majorityElement(new int[]{1, 2, 1}));
        assertEquals(1, s.majorityElement(new int[]{1}));
        assertEquals(1, s.majorityElement(new int[]{1, 1}));
    }
}