package com.github.daniiltyshchenko.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q217ContainsDuplicateTest {

    @Test
    public void test01() {
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_01(new int[]{1,2,3,1})).isTrue();
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_01(new int[]{1,2,3,4})).isFalse();
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_01(new int[]{1,1,1,3,3,4,3,2,4,2})).isTrue();
    }

    @Test
    public void test02() {
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_02(new int[]{1,2,3,1})).isTrue();
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_02(new int[]{1,2,3,4})).isFalse();
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_02(new int[]{1,1,1,3,3,4,3,2,4,2})).isTrue();
    }

    @Test
    public void test03() {
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_03(new int[]{1,2,3,1})).isTrue();
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_03(new int[]{1,2,3,4})).isFalse();
        Assertions.assertThat(Q217ContainsDuplicate.containsDuplicate_03(new int[]{1,1,1,3,3,4,3,2,4,2})).isTrue();
        
    }
}
