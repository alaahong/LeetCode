package cn.ianzhang.No0171ExcelSheetColumnNumber;

/**
 * Created by Ian on 2016/1/23.
 */
public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        String t = s.trim().toUpperCase();
        for (int i = 0; i < s.length(); i++) {
            result = ((int) t.charAt(i) - 65 + 1) + result * 26;
        }
        return result;
    }
}
