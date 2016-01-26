package cn.ianzhang.No0013RomantoInteger;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2016/1/26.
 */
public class SolutionTest {

    @Test
    public void testRomanToInt() throws Exception {
        Solution s = new Solution();
        assertEquals(s.romanToInt("XLV"), 45);
        assertEquals(s.romanToInt("MCMLXXX"), 1980);
        assertEquals(s.romanToInt("XIX"), 19);
        assertEquals(s.romanToInt("III"), 3);
        assertEquals(s.romanToInt("IIII"), 4);
    }
}