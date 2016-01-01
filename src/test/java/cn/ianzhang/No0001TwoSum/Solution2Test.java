package cn.ianzhang.No0001TwoSum;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Ian on 2015/12/25.
 */
public class Solution2Test {

    @Test
    public void testTwoSum() throws Exception {
        assertArrayEquals(new int[]{2, 3}, new Solution2().twoSum(new int[]{3, 2, 4}, 6));
        assertArrayEquals(new int[]{1, 4}, new Solution2().twoSum(new int[]{0, 2, 4, 0}, 0));
        assertArrayEquals(new int[]{3, 5}, new Solution2().twoSum(new int[]{-1, -2, -3, -4, -5}, -8));
    }
}