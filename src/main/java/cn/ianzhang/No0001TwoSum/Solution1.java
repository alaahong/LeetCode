package cn.ianzhang.No0001TwoSum;

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
 * <p>
 * <p>
 * 1 Keng:
 * we should optimize the time complexity as a line as Solution2~
 */
public class Solution1 {
    public int[] twoSum(int[] nums, int target) {

        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (i != j) {
                    if (nums[i] + nums[j] == target) {
                        if (i <= j) {
                            return new int[]{++i, ++j};
                        } else {
                            return new int[]{++j, ++i};
                        }
                    }
                }
            }
        }
        return null;
    }
}
