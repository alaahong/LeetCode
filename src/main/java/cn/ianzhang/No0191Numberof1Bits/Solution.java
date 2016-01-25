package cn.ianzhang.No0191Numberof1Bits;

/**
 * Created by Ian on 2016/1/25.
 */
public class Solution {
    public int hammingWeight(int n) {
        int counter = 0;
        while (n != 0) {
            if (n % 2 != 0) {
                counter++;
            }
            n = n >>> 1;
        }
        return counter;
    }
}
