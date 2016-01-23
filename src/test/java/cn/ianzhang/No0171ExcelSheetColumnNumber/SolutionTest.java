package cn.ianzhang.No0171ExcelSheetColumnNumber;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by Ian on 2016/1/23.
 */
public class SolutionTest {

    @Test
    public void testTitleToNumber() throws Exception {
        Solution s = new Solution();
        assertEquals(1, s.titleToNumber("A"));
        assertEquals(27, s.titleToNumber("AA"));
        assertEquals(703, s.titleToNumber("AAA"));
        assertEquals(704, s.titleToNumber("AAB"));
    }
}