package cn.ianzhang.No0003LongestSubstringWithoutRepeatingCharacters;


import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Solution1 {
    public int lengthOfLongestSubstring(String s) {
        if (Objects.nonNull(s) && s.length() > 0) {
            int n = s.length();
            if (s.length() == 1) {
                return 1;
            } else {
                int max = 0;
                for (int i = 0; i < n; i++) {
                    for (int j = i+1; j <= n; j++) {
                        if (checkUnique(s.substring(i, j))) {
                            max = Math.max(s.substring(i, j).length(),max);
                        }
                    }
                }
                return max;
            }
        }
        return 0;
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
