package cn.ianzhang.No0202HappyNumber;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ian on 2016/1/28.
 */
public class SolutionTest {

    @Test
    public void testIsHappy() throws Exception {
        Solution s = new Solution();
        assertTrue(s.isHappy(19));
        assertTrue(s.isHappy(1));
        assertTrue(s.isHappy(10));
        assertTrue(s.isHappy(100));
        assertTrue(s.isHappy(7));
        assertFalse(s.isHappy(2));
    }
}