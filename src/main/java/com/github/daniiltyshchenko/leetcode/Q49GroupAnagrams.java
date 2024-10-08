package com.github.daniiltyshchenko.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Q49GroupAnagrams {

    /**
     * Time complexity: O(m * nlogN)
     * Space complexity: O(m * n)
     * Where m is the number of strings and n is the length of the longest string.
     */
    public static List<List<String>> groupAnagrams_01(String[] strs) {
        Map<String, List<String>> keyToAnagrams = new HashMap<>();

        for (String word : strs) {
            char[] charArray = word.toCharArray();
            Arrays.sort(charArray);
            String key = new String(charArray);

            keyToAnagrams.putIfAbsent(key, new ArrayList<>());
            keyToAnagrams.get(key).add(word);
        }

        return new ArrayList<>(keyToAnagrams.values());
    }

    /**
     * Time complexity: O(m * n)
     * Space complexity: O(m)
     * Where m is the number of strings and n is the length of the longest string.
     */
    public static List<List<String>> groupAnagrams_02(String[] strs) {
        Map<String, List<String>> keyToAnagrams = new HashMap<>();

        for (String word : strs) {
            int[] table = new int[26];
            for (int i = 0; i < word.toCharArray().length; i++) {
                table[word.charAt(i) - 'a']++;
            }

            String key = Arrays.toString(table);

            keyToAnagrams.putIfAbsent(key, new ArrayList<>());
            keyToAnagrams.get(key).add(word);
        }

        return new ArrayList<>(keyToAnagrams.values());
    }
}
