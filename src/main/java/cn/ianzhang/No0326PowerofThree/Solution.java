package cn.ianzhang.No0326PowerofThree;

/**
 * Created by Ian Zhang on 26/04/2016.
 */
public class Solution {
    public boolean isPowerOfThree(int n) {
        // 1162261467 is 3^19,  3^20 is bigger than int
        return ( n>0 &&  1162261467%n==0);
    }
}
