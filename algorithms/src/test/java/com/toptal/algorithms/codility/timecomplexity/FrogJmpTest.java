package com.toptal.algorithms.codility.timecomplexity;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class FrogJmpTest {
    @Test
    public void testSolution() {
        assertEquals(0, new FrogJmp.Solution().solution(1,1,10));
        assertEquals(1, new FrogJmp.Solution().solution(1,2,10));
        assertEquals(10, new FrogJmp.Solution().solution(1, 101, 10));
        assertEquals(11, new FrogJmp.Solution().solution(1, 102, 10));
    }
}