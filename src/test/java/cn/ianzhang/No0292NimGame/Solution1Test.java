package cn.ianzhang.No0292NimGame;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by Ian on 2015/12/26.
 */
public class Solution1Test {

    @Test
    public void testCanWinNim() throws Exception {
        Solution1 s = new Solution1();
        assertEquals(false,s.canWinNim(0));
        assertEquals(true,s.canWinNim(1));
        assertEquals(true,s.canWinNim(2));
        assertEquals(true,s.canWinNim(3));
        assertEquals(false,s.canWinNim(4));
        assertEquals(true,s.canWinNim(5));
        assertEquals(false,s.canWinNim(100));
        assertEquals(false,s.canWinNim(456));
    }
}