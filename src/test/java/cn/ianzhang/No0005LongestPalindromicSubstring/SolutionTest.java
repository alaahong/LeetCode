package cn.ianzhang.No0005LongestPalindromicSubstring;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class SolutionTest {
Solution s = new Solution();
    @Test
    public void longestPalindrome() {
        Assert.assertEquals(s.longestPalindrome("ac"),"a");
        Assert.assertEquals(s.longestPalindrome("babad"),"bab");
        Assert.assertEquals(s.longestPalindrome("cbbd"),"bb");;
    }

    @Test
    public void checkPalindromic() {
        Assert.assertEquals(s.checkPalindromic("a"),true);
        Assert.assertEquals(s.checkPalindromic("abba"),true);
        Assert.assertEquals(s.checkPalindromic("aa"),true);
        Assert.assertEquals(s.checkPalindromic("aaa"),true);
    }
}