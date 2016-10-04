package cn.ianzhang.No0338CountingBits;

import org.junit.Assert;
import org.junit.Test;


/**
 * Created by Ian on 2016/10/4.
 */
public class SolutionTest {

    @Test
    public void testCountBits() throws Exception {
        Solution solution = new Solution();
        Assert.assertArrayEquals(solution.countBits(5),new int[]{0,1,1,2,1,2});
    }
}