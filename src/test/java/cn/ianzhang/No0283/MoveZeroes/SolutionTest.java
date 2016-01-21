package cn.ianzhang.No0283.MoveZeroes;

import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;

/**
 * Created by Ian on 2016/1/21.
 */
public class SolutionTest {

    @Test
    public void testMoveZeroes() throws Exception {
        int[] arr = {1, 2, 3, 0, 0, 4, 5, 6, 0};
        Solution s = new Solution();
        s.moveZeroes(arr);
        assertArrayEquals(arr, new int[]{1, 2, 3, 4, 5, 6, 0, 0, 0});
    }

}