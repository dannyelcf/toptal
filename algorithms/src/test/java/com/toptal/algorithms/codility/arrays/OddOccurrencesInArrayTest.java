package com.toptal.algorithms.codility.arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class OddOccurrencesInArrayTest {
    @Test
    public void testSolution() {
        assertEquals(1, new OddOccurrencesInArray.Solution().solution(new int[]{1}));
        assertEquals(2, new OddOccurrencesInArray.Solution().solution(new int[]{1, 2, 1}));
        assertEquals(3, new OddOccurrencesInArray.Solution().solution(new int[]{3, 1, 2, 1, 2}));
    }

    @Test
    public void testSolution2() {
        assertEquals(1, new OddOccurrencesInArray.Solution().solution2(new int[]{1}));
        assertEquals(2, new OddOccurrencesInArray.Solution().solution2(new int[]{1, 2, 1}));
        assertEquals(3, new OddOccurrencesInArray.Solution().solution2(new int[]{3, 1, 2, 1, 2}));
    }
}