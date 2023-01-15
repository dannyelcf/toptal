package com.toptal.algorithms.extras;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class ConvertIntegerToBinaryStringTest {
    @Test
    public void test() {
        assertEquals(Integer.toBinaryString(0), new ConvertIntegerToBinaryString.Solution().solution(0));
        assertEquals(Integer.toBinaryString(1), new ConvertIntegerToBinaryString.Solution().solution(1));
        assertEquals(Integer.toBinaryString(2), new ConvertIntegerToBinaryString.Solution().solution(2));
        assertEquals(Integer.toBinaryString(3), new ConvertIntegerToBinaryString.Solution().solution(3));
        assertEquals(Integer.toBinaryString(4), new ConvertIntegerToBinaryString.Solution().solution(4));
        assertEquals(Integer.toBinaryString(5), new ConvertIntegerToBinaryString.Solution().solution(5));
        assertEquals(Integer.toBinaryString(6), new ConvertIntegerToBinaryString.Solution().solution(6));
        assertEquals(Integer.toBinaryString(7), new ConvertIntegerToBinaryString.Solution().solution(7));
    }
}