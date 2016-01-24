package cn.ianzhang.No0217ContainsDuplicate;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by Ian on 24/01/2016.
 */
public class Solution {
    public boolean containsDuplicate(int[] nums) {
        if (nums == null || nums.length < 2) {
            return false;
        }
        Set<Integer> set = new HashSet<>();
        for (Integer n : nums) {
            if (set.contains(n)) {
                return true;
            } else {
                set.add(n);
            }
        }
        return false;
    }
}
