package com.github.daniiltyshchenko.leetcode;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

public class Q1TwoSumTest {

    @Test
    public void test01() {
        Assertions.assertThat(Q1TwoSum.twoSum_01(new int[]{2,7,11,15}, 9)).containsOnly(0,1);
        Assertions.assertThat(Q1TwoSum.twoSum_01(new int[]{3,2,4}, 6)).containsOnly(1,2);
        Assertions.assertThat(Q1TwoSum.twoSum_01(new int[]{3,3}, 6)).containsOnly(0,1);
    }

    @Test
    public void test02() {
        Assertions.assertThat(Q1TwoSum.twoSum_02(new int[]{2,7,11,15}, 9)).containsOnly(0,1);
        Assertions.assertThat(Q1TwoSum.twoSum_02(new int[]{3,2,4}, 6)).containsOnly(1,2);
        Assertions.assertThat(Q1TwoSum.twoSum_02(new int[]{3,3}, 6)).containsOnly(0,1);
    }
}
