package com.toptal.algorithms.codility.arrays;

import com.toptal.algorithms.codility.iterations.BinaryGap;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

public class CyclicRotationTest {
    @Test
    public void testSolution() {
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution(new int[]{}, 0));
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution(new int[]{}, 1));
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution(new int[]{}, 100));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution(new int[]{1}, 0));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution(new int[]{1}, 1));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution(new int[]{1}, 2));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution(new int[]{1}, 100));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution(new int[]{1, 2}, 0));
        assertArrayEquals(new int[]{2, 1}, new CyclicRotation.Solution().solution(new int[]{1, 2}, 1));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution(new int[]{1, 2}, 2));
        assertArrayEquals(new int[]{2, 1}, new CyclicRotation.Solution().solution(new int[]{1, 2}, 3));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution(new int[]{1, 2}, 100));
        assertArrayEquals(new int[]{1, 2, 3}, new CyclicRotation.Solution().solution(new int[]{1, 2, 3}, 0));
        assertArrayEquals(new int[]{3, 1, 2}, new CyclicRotation.Solution().solution(new int[]{1, 2, 3}, 1));
        assertArrayEquals(new int[]{2, 3, 1}, new CyclicRotation.Solution().solution(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 2, 3}, new CyclicRotation.Solution().solution(new int[]{1, 2, 3}, 3));
        assertArrayEquals(new int[]{3, 1, 2}, new CyclicRotation.Solution().solution(new int[]{1, 2, 3}, 100));
    }

    @Test
    public void testSolution2() {
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution2(new int[]{}, 0));
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution2(new int[]{}, 1));
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution2(new int[]{}, 100));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution2(new int[]{1}, 0));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution2(new int[]{1}, 1));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution2(new int[]{1}, 2));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution2(new int[]{1}, 100));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution2(new int[]{1, 2}, 0));
        assertArrayEquals(new int[]{2, 1}, new CyclicRotation.Solution().solution2(new int[]{1, 2}, 1));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution2(new int[]{1, 2}, 2));
        assertArrayEquals(new int[]{2, 1}, new CyclicRotation.Solution().solution2(new int[]{1, 2}, 3));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution2(new int[]{1, 2}, 100));
        assertArrayEquals(new int[]{1, 2, 3}, new CyclicRotation.Solution().solution2(new int[]{1, 2, 3}, 0));
        assertArrayEquals(new int[]{3, 1, 2}, new CyclicRotation.Solution().solution2(new int[]{1, 2, 3}, 1));
        assertArrayEquals(new int[]{2, 3, 1}, new CyclicRotation.Solution().solution2(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 2, 3}, new CyclicRotation.Solution().solution2(new int[]{1, 2, 3}, 3));
        assertArrayEquals(new int[]{3, 1, 2}, new CyclicRotation.Solution().solution2(new int[]{1, 2, 3}, 100));
    }

    @Test
    public void testSolution3() {
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution3(new int[]{}, 0));
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution3(new int[]{}, 1));
        assertArrayEquals(new int[]{}, new CyclicRotation.Solution().solution3(new int[]{}, 100));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution3(new int[]{1}, 0));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution3(new int[]{1}, 1));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution3(new int[]{1}, 2));
        assertArrayEquals(new int[]{1}, new CyclicRotation.Solution().solution3(new int[]{1}, 100));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution3(new int[]{1, 2}, 0));
        assertArrayEquals(new int[]{2, 1}, new CyclicRotation.Solution().solution3(new int[]{1, 2}, 1));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution3(new int[]{1, 2}, 2));
        assertArrayEquals(new int[]{2, 1}, new CyclicRotation.Solution().solution3(new int[]{1, 2}, 3));
        assertArrayEquals(new int[]{1, 2}, new CyclicRotation.Solution().solution3(new int[]{1, 2}, 100));
        assertArrayEquals(new int[]{1, 2, 3}, new CyclicRotation.Solution().solution3(new int[]{1, 2, 3}, 0));
        assertArrayEquals(new int[]{3, 1, 2}, new CyclicRotation.Solution().solution3(new int[]{1, 2, 3}, 1));
        assertArrayEquals(new int[]{2, 3, 1}, new CyclicRotation.Solution().solution3(new int[]{1, 2, 3}, 2));
        assertArrayEquals(new int[]{1, 2, 3}, new CyclicRotation.Solution().solution3(new int[]{1, 2, 3}, 3));
        assertArrayEquals(new int[]{3, 1, 2}, new CyclicRotation.Solution().solution3(new int[]{1, 2, 3}, 100));
    }
}