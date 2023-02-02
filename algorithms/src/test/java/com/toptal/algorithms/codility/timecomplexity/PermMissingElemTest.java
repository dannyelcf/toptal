package com.toptal.algorithms.codility.timecomplexity;

import org.junit.jupiter.api.Test;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static org.junit.jupiter.api.Assertions.*;

public class PermMissingElemTest {
    @Test
    public void test() {
        assertEquals(5, new PermMissingElem().solution(new int[]{1, 2, 3, 4}));
        assertEquals(4, new PermMissingElem().solution(new int[]{1, 2, 3, 5}));
        assertEquals(10001, new PermMissingElem().solution(IntStream.rangeClosed(1, 10000).toArray()));
        assertEquals(100001, new PermMissingElem().solution(IntStream.rangeClosed(1, 100000).toArray()));
    }
}