package cn.ianzhang.No0070ClimbingStairs;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2016/1/27.
 */
public class SolutionTest {

    @Test
    public void testClimbStairs() throws Exception {
        Solution s = new Solution();
        assertEquals(1, s.climbStairs(1));
        assertEquals(2, s.climbStairs(2));
        assertEquals(3, s.climbStairs(3));
        assertEquals(1134903170, s.climbStairs(44));
    }
}