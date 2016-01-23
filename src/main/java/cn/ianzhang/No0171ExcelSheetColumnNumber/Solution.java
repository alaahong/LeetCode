package cn.ianzhang.No0171ExcelSheetColumnNumber;

/**
 * Created by Ian on 2016/1/23.
 */
public class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        String t = s.trim().toUpperCase();
        for (int i = t.length() - 1; i >= 0; i--) {
            if (i == t.length() - 1) {
                result = result + ((int) t.charAt(i)) - 65 + 1;
            } else {
                result = result + ((int) t.charAt(i) - 65 + 1) * (int) Math.pow(26, t.length() - 1 - i);
            }
        }
        return result;
    }
}
