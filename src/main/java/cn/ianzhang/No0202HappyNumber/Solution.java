package cn.ianzhang.No0202HappyNumber;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ian on 2016/1/28.
 */
public class Solution {
    public boolean isHappy(int n) {
        Set<Integer> set = new HashSet<>();
        while (n > 0) {
            if (n == 1) {
                return true;
            } else {
                n = getSumSubNumber(n, set);
                set.add(n);
            }
        }
        return n == 1;
    }

    private int getSumSubNumber(int n, Set<Integer> set) {
        int result = 0;
        while (n / 10 >= 1) {
            result += (int) Math.pow(n % 10, 2);
            n /= 10;
        }
        int k = result + n * n;
        return set.contains(k) ? -1 : k;
    }
}
