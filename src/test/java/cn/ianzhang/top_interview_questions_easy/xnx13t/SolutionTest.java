package cn.ianzhang.top_interview_questions_easy.xnx13t;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Ian
 * @Date: 2021/7/2 20:29
 * @Description:
 */
public class SolutionTest {

    @Test
    public void reverse(){
        int i = 123;
        Solution solution = new Solution();
        Assert.assertEquals(321, solution.reverse(i));
    }
}
