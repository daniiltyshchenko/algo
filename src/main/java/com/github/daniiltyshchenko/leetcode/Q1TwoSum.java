package com.github.daniiltyshchenko.leetcode;

import java.util.HashMap;
import java.util.Map;

public class Q1TwoSum {

    /**
     * Time complexity: O(n^2)
     * Space complexity: O(1)
     */
    public static int[] twoSum_01(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }

        throw new AssertionError("Should have at least one solution!");
    }

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static int[] twoSum_02(int[] nums, int target) {
        Map<Integer, Integer> valueToIndex = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (valueToIndex.containsKey(target - nums[i])) {
                return new int[]{valueToIndex.get(target-nums[i]), i};
            }

            valueToIndex.put(nums[i], i);
        }

        throw new AssertionError("Should have at least one solution!");
    }
}
