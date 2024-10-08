package com.github.daniiltyshchenko.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Q242ValidAnagram {

    /**
     * Time complexity: O(nlogn)
     * Space complexity: O(n)
     */
    public static boolean isAnagram_01(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        for (int i = 0; i < s.length(); i++) {
            if (charArrayS[i] != charArrayT[i]) return false;
        }

        return true;
    }

    /**
     * Time complexity: O(nlogn)
     * Space complexity: O(n)
     */
    public static boolean isAnagram_02(String s, String t) {
        if (s.length() != t.length()) return false;

        char[] charArrayS = s.toCharArray();
        char[] charArrayT = t.toCharArray();
        Arrays.sort(charArrayS);
        Arrays.sort(charArrayT);

        return Arrays.equals(charArrayS, charArrayT);
    }

    /**
     * More efficient if we may have uppercase letters and numbers.
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static boolean isAnagram_03(String s, String t) {
        if (s.length() != t.length()) return false;

        Map<Character, Integer> counter = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            counter.put(s.charAt(i), counter.getOrDefault(s.charAt(i), 0) + 1);
            counter.put(t.charAt(i), counter.getOrDefault(t.charAt(i), 0) - 1);
        }

        for (Integer value : counter.values()) {
            if (value != 0) return false;
        }

        return true;
    }

    /**
     * More efficient for only lowercase letters.
     * <p>
     * Time complexity: O(n)
     * Space complexity: O(1)
     */
    public static boolean isAnagram_04(String s, String t) {
        if (s.length() != t.length()) return false;

        int[] table = new int[26];

        for (int i = 0; i < s.length(); i++) {
            table[s.charAt(i) - 'a']++;
            table[t.charAt(i) - 'a']--;
        }

        for (int i : table) {
            if (i!=0) return false;
        }

        return true;
    }
}

