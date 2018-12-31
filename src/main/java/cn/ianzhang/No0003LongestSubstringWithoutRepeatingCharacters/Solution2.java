package cn.ianzhang.No0003LongestSubstringWithoutRepeatingCharacters;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution2 {

    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        if (Objects.nonNull(s) && s.length() > 0) {
            int n = s.length();
            if (n == 1) {
                return 1;
            }
            int i = 0;
            int j = 1;

            while (i < n && j <= n) {
                if (checkUnique(s.substring(i, j))) {
                    max = Math.max(max, j-i);
                    j++;
                } else {
                    i++;
                    j++;
                }
            }
        }
        return max;
    }

    private boolean checkUnique(String subStr) {
        Set<Character> cs = new HashSet();
        for (Character c : subStr.toCharArray()) {
            if (cs.contains(c)) {
                return false;
            } else {
                cs.add(c);
            }
        }
        return true;
    }
}
