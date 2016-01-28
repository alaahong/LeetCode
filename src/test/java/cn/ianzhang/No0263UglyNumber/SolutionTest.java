package cn.ianzhang.No0263UglyNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ian on 2016/1/28.
 */
public class SolutionTest {

    @Test
    public void testIsUgly() throws Exception {
        Solution s = new Solution();
        assertTrue(s.isUgly(1));
        assertTrue(s.isUgly(2));
        assertTrue(s.isUgly(3));
        assertTrue(s.isUgly(5));
        assertTrue(s.isUgly(10));
        assertTrue(s.isUgly(12));
        assertFalse(s.isUgly(13));
        assertFalse(s.isUgly(14));
        assertFalse(s.isUgly(99));
        assertFalse(s.isUgly(-1000));
        assertFalse(s.isUgly(-2147483648));
    }
}