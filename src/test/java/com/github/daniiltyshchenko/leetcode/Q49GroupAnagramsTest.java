package com.github.daniiltyshchenko.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Collections;
import java.util.List;

public class Q49GroupAnagramsTest {

    @Test
    public void test01() {
        List<List<String>> result = Q49GroupAnagrams.groupAnagrams_01(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        result.forEach(Collections::sort);
        Assertions.assertThat(result).containsExactlyInAnyOrder(List.of("bat"), List.of("nat","tan"), List.of("ate","eat","tea"));
        Assertions.assertThat(Q49GroupAnagrams.groupAnagrams_01(new String[]{""})).containsOnly(List.of(""));
        Assertions.assertThat(Q49GroupAnagrams.groupAnagrams_01(new String[]{"a"})).containsOnly(List.of("a"));
    }

    @Test
    public void test02() {
        List<List<String>> result = Q49GroupAnagrams.groupAnagrams_02(new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});
        result.forEach(Collections::sort);
        Assertions.assertThat(result).containsExactlyInAnyOrder(List.of("bat"), List.of("nat","tan"), List.of("ate","eat","tea"));
        Assertions.assertThat(Q49GroupAnagrams.groupAnagrams_02(new String[]{""})).containsOnly(List.of(""));
        Assertions.assertThat(Q49GroupAnagrams.groupAnagrams_02(new String[]{"a"})).containsOnly(List.of("a"));
    }
}
