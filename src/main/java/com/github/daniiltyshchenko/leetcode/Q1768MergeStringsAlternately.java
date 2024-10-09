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

    /**
     * Time complexity: O(n)
     * Space complexity: O(n)
     */
    public static String mergeAlternately_02(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int length1 = word1.length();
        int length2 = word2.length();

        int min = Math.min(length1, length2);
        for (int i = 0; i < min; i++) {
            sb.append(word1.charAt(i)).append(word2.charAt(i));
        }

        if (length1 == length2) {
            return sb.toString();
        } else if (length1 < length2) {
            sb.append(word2, min, length2);
        } else {
            sb.append(word1, min, length1);
        }

        return sb.toString();
    }
}
