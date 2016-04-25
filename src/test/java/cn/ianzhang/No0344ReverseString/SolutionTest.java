package cn.ianzhang.No0344ReverseString;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2016/4/25.
 */
public class SolutionTest {

    @Test
    public void testReverseString() throws Exception {
        assertEquals("olleh",new Solution().reverseString("hello"));
    }
}