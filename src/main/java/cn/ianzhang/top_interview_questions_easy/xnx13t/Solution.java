package cn.ianzhang.top_interview_questions_easy.xnx13t;

/**
 * @Author: Ian
 * @Date: 2021/7/2 20:31
 * @Description:
 */
public class Solution {
    public int reverse(int i) {
        int result = 0;
        while (i != 0) {
            int t = i % 10;
            int res = result * 10 + t;
            if ((res - t) / 10 != result) {
                return 0;
            }
            result = res;
            i = i / 10;
        }
        return result;
    }
}
