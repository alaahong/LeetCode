package cn.ianzhang.No0258AddDigits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2016/1/20.
 */
public class SolutionTest {

    @Test
    public void testAddDigits() throws Exception {
        Solution s = new Solution();
        assertEquals(s.addDigits(0), 0);
        assertEquals(s.addDigits(10), 1);
        assertEquals(s.addDigits(99), 9);
        assertEquals(s.addDigits(101), 2);
        assertEquals(s.addDigits(9999), 9);
        assertEquals(s.addDigits(12345), 6);
    }
}