package cn.ianzhang.No0001TwoSum;

import java.util.*;

/**
 * Created by Ian on 2015/12/25.
 * <p>
 * Given an array of integers, find two numbers such that they add up to a specific target number.
 * <p>
 * The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2. Please note that your returned answers (both index1 and index2) are not zero-based.
 * <p>
 * You may assume that each input would have exactly one solution.
 * <p>
 * Input: numbers={2, 7, 11, 15}, target=9
 * Output: index1=1, index2=2
 *
 *
 * 1 Keng:
 * we should optimize the time complexity as a line as solution2~
 */
public class Solution2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            if (map.get(target - nums[i]) != null) {
                result[0] = map.get(target - nums[i]) + 1;
                result[1] = i + 1;
            } else {
                map.put(nums[i], i);
            }
        }
        return result;
    }
}
