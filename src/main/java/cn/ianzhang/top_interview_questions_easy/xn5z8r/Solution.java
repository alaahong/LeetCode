package cn.ianzhang.top_interview_questions_easy.xn5z8r;

/**
 * @Author: Ian
 * @Date: 2021/7/2 20:41
 * @Description:
 */
public class Solution {
    public int firstUniqChar(String s) {
        for(int i = 0; i<s.length();i++){
            if(s.indexOf(s.charAt(i)) == s.lastIndexOf(s.charAt(i))){
                return i;
            }
        }
        return -1;
    }
}
