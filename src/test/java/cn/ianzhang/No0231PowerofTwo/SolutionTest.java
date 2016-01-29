package cn.ianzhang.No0231PowerofTwo;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ian on 2016/1/29.
 */
public class SolutionTest {
    private Solution s ;
    @Before
    public void init(){
        s = new Solution();
    }
    @Test
    public void testIsPowerOfTwo() throws Exception {
        assertTrue(s.isPowerOfTwo(1));
        assertTrue(s.isPowerOfTwo(2));
        assertTrue(s.isPowerOfTwo(4));
        assertTrue(s.isPowerOfTwo(8));
        assertTrue(s.isPowerOfTwo(256));
        assertFalse(s.isPowerOfTwo(0));
        assertFalse(s.isPowerOfTwo(3));
        assertFalse(s.isPowerOfTwo(26));
        assertFalse(s.isPowerOfTwo(255));
    }
}