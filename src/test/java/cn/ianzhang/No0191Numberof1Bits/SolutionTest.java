package cn.ianzhang.No0191Numberof1Bits;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2016/1/25.
 */
public class SolutionTest {

    @Test
    public void testHammingWeight() throws Exception {
        Solution s = new Solution();
        assertEquals(3, s.hammingWeight(11));
    }
}