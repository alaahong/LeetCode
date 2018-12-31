package cn.ianzhang.No0003LongestSubstringWithoutRepeatingCharacters;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
private Solution solution = new Solution();
    @Test
    public void lengthOfLongestSubstring() {
        Assert.assertEquals( solution.lengthOfLongestSubstring("abcabcbb" ),3);
    }
}