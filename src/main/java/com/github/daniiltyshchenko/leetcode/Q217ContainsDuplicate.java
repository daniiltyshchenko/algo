package com.github.daniiltyshchenko.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Q217ContainsDuplicate {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static boolean containsDuplicate_01(int[] nums) {
        return Arrays.stream(nums).distinct().count() < nums.length;
    }

    /**
     * The most efficient as we iterate over the array once,
     * and each add/check operation on the HashSet is O(1) on average.
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static boolean containsDuplicate_02(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            if (!set.add(i)) return true;
        }
        return false;
    }

    /**
     * Time complexity: O(nlogn)
     * Space complexity: O(n)
     */
    public static boolean containsDuplicate_03(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i-1]) {
                return true;
            }
        }

        return false;
    }
}
