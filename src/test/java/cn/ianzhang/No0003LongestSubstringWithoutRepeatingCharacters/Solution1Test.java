package cn.ianzhang.No0003LongestSubstringWithoutRepeatingCharacters;

import org.junit.Assert;
import org.junit.Test;

public class Solution1Test {
    Solution1 s = new Solution1();

    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals( s.lengthOfLongestSubstring("abcabcbb" ),3);
        Assert.assertEquals( s.lengthOfLongestSubstring("au" ),2);
    }
}