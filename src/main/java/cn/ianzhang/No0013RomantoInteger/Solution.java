package cn.ianzhang.No0013RomantoInteger;

/**
 * Created by Ian on 2016/1/26.
 */
public class Solution {
    public int romanToInt(String s) {
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i == s.length() - 1) {
                return sum + getVal(s.charAt(i));
            }
            char c1 = s.charAt(i);
            char c2 = s.charAt(i + 1);
            int n1 = getVal(c1);
            int n2 = getVal(c2);
            if (n1 < n2) {
                sum = sum - n1;
            } else {
                sum = sum + n1;
            }
        }
        return sum;
    }

    private int getVal(char c) {
        switch (c) {
            case 'I':
                return 1;
            case 'X':
                return 10;
            case 'C':
                return 100;
            case 'M':
                return 1000;
            case 'V':
                return 5;
            case 'L':
                return 50;
            case 'D':
                return 500;
            default:
                break;
        }
        return c;
    }

}

