package cn.ianzhang.No0020ValidParentheses;

import java.util.Stack;

/**
 * @Author: Ian
 * @Date: 2020/5/17 15:34
 * @Description:
 */
public class Solution {
    public boolean isValid(String s) {
        if (s.length() % 2 == 1) {
            return false;
        }
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char curChar = s.charAt(i);
            if (curChar == '(' || curChar == '{' || curChar == '[') {
                stack.push(curChar);
            } else {
                if (stack.empty()) {
                    return false;
                }
                char preChar = stack.peek();
                if ((curChar == ')' && preChar == '(')
                        || (curChar == '}' && preChar == '{')
                        || (curChar == ']' && preChar == '[')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.empty();
    }

}