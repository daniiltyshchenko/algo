package com.github.daniiltyshchenko.leetcode;

public class Q1768MergeStringsAlternately {

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static String mergeAlternately_01(String word1, String word2) {
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < Math.max(word1.length(), word2.length()); i++) {
            if (i < word1.length()) {
                builder.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                builder.append(word2.charAt(i));
            }
        }

        return builder.toString();
    }
}
