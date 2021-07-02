package cn.ianzhang.top_interview_questions_easy.xn5z8r;

import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: Ian
 * @Date: 2021/7/2 20:40
 * @Description:
 */
public class SolutionTest {
    @Test
    public void firstUniqChar() {
        Solution solution = new Solution();
        Assert.assertEquals(0, solution.firstUniqChar("leetcode"));
        Assert.assertEquals(2, solution.firstUniqChar("loveleetcode"));
    }
}
