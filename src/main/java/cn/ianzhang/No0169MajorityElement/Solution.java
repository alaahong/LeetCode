package cn.ianzhang.No0169MajorityElement;

/**
 * Created by Ian on 24/01/2016.
 * Resolve via Moore’s Voting Algorithm
 */
public class Solution {
    public int majorityElement(int[] nums) {
        int index = 0;
        int count = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[index] == nums[i]) {
                count++;
            } else {
                count--;
            }
            if (count == 0) {
                index = i;
                count = 1;
            }
        }
        return nums[index];
    }
}
