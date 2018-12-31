package cn.ianzhang.No0003LongestSubstringWithoutRepeatingCharacters;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class Solution2Test {

    Solution2 s = new Solution2();

    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals( s.lengthOfLongestSubstring("abcabcbb" ),3);
        Assert.assertEquals( s.lengthOfLongestSubstring("au" ),2);
    }
}