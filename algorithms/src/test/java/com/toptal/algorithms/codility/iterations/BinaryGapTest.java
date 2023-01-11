package com.toptal.algorithms.codility.iterations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryGapTest {
    @Test
    public void shouldReturn0WhenBinaryHasNoGaps() {
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("0000", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("0001", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("0010", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("0100", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("1000", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("0011", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("0110", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("1100", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("0111", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("1110", 2)), 0);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("1111", 2)), 0);
    }

    @Test
    public void shouldReturn1WhenBinaryHas1Gap() {
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("01010101", 2)), 1);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("10101010", 2)), 1);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("01011010", 2)), 1);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("10101000", 2)), 1);
    }

    @Test
    public void shouldReturn2WhenBinaryHas2Gap() {
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("01011001", 2)), 2);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("10011010", 2)), 2);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("10010010", 2)), 2);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("10010000", 2)), 2);
    }

    @Test
    public void shouldReturn3WhenBinaryHas3Gap() {
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("100010010100000", 2)), 3);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("000001010010001", 2)), 3);
        assertEquals(new BinaryGap.Solution().solution(Integer.parseInt("100010010010001", 2)), 3);
    }
}