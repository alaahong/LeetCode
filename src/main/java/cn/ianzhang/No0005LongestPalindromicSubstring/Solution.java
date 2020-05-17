package cn.ianzhang.No0005LongestPalindromicSubstring;

import java.util.Objects;

/**
 * author Ian
 */
class Solution {
    public String longestPalindrome(String s) {
        if (Objects.nonNull(s) && s.length() > 0 && s.length() <= 1000) {
            String result = "";
            int len = s.length();
            for (int i = 0; i < len; i++) {
                for (int j = i + 1; j <= len; j++) {
                    String tempStr = s.substring(i, j);
                    if (checkPalindromic(tempStr)) {
                        if (tempStr.length() > result.length()) {
                            result = tempStr;
                        }
                    }
                }
            }
            return result;
        } else {
            return "";
        }
    }

    public boolean checkPalindromic(String subStr) {
        int end = subStr.length() - 1;
        int start = 0;
        while (start <= end) {
            if (subStr.charAt(start) != subStr.charAt(end)) {
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}