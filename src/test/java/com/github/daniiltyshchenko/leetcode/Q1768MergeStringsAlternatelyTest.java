package com.github.daniiltyshchenko.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q1768MergeStringsAlternatelyTest {

    @Test
    public void test_01() {
        Assertions.assertThat(Q1768MergeStringsAlternately.mergeAlternately_01("abc", "pqr")).isEqualTo("apbqcr");
        Assertions.assertThat(Q1768MergeStringsAlternately.mergeAlternately_01("ab", "pqrs")).isEqualTo("apbqrs");
        Assertions.assertThat(Q1768MergeStringsAlternately.mergeAlternately_01("abcd", "pq")).isEqualTo("apbqcd");
    }
}
