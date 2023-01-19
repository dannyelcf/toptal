package com.toptal.algorithms.codility.timecomplexity;

public class FrogJmp {
    static class Solution {
        // O(1)
        public int solution(int X, int Y, int D) {
            int diff = Y - X;
            int jumps = diff / D;
            int complement = diff % D == 0 ? 0 : 1;
            return jumps + complement;
        }
    }
}
