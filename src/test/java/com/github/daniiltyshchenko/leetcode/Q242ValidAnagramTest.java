package com.github.daniiltyshchenko.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q242ValidAnagramTest {

    @Test
    public void test01() {
        Assertions.assertThat(Q242ValidAnagram.isAnagram_01("anagram", "nagaram")).isTrue();
        Assertions.assertThat(Q242ValidAnagram.isAnagram_01("rat", "car")).isFalse();
    }

    @Test
    public void test02() {
        Assertions.assertThat(Q242ValidAnagram.isAnagram_02("anagram", "nagaram")).isTrue();
        Assertions.assertThat(Q242ValidAnagram.isAnagram_02("rat", "car")).isFalse();
    }

    @Test
    public void test03() {
        Assertions.assertThat(Q242ValidAnagram.isAnagram_03("anagram", "nagaram")).isTrue();
        Assertions.assertThat(Q242ValidAnagram.isAnagram_03("rat", "car")).isFalse();
    }

    @Test
    public void test04() {
        Assertions.assertThat(Q242ValidAnagram.isAnagram_04("anagram", "nagaram")).isTrue();
        Assertions.assertThat(Q242ValidAnagram.isAnagram_04("rat", "car")).isFalse();
    }
}
