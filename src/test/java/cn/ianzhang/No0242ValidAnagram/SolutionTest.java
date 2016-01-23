package cn.ianzhang.No0242ValidAnagram;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by Ian on 2016/1/23.
 */
public class SolutionTest {

    @Test
    public void testIsAnagram() throws Exception {
        Solution s = new Solution();
        assertTrue(s.isAnagram("asdfghj", "jhgfdsa"));
        assertTrue(s.isAnagram("", ""));
        assertTrue(s.isAnagram("a", "a"));
        assertFalse(s.isAnagram(null, ""));
        assertFalse(s.isAnagram("asd", "dsd"));
        assertFalse(s.isAnagram(null, null));
        assertFalse(s.isAnagram("a", "ab"));

    }
}