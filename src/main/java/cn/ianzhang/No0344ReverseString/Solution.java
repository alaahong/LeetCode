package cn.ianzhang.No0344ReverseString;

/**
 * Created by Ian on 2016/4/25.
 */
public class Solution {
    public String reverseString(String s) {
        return new StringBuilder(s).reverse().toString();
    }
}