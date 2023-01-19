package com.toptal.algorithms.codility.arrays;

import java.util.HashSet;

public class OddOccurrencesInArray {
    static class Solution {
        // O(N)
        public int solution(int[] A) {
            int result = A[0];
            for (int i = 1; i < A.length; i++) {
                result = result ^ A[i];
            }
            return result;
        }

        // O(N)
        public int solution2(int[] A) {
            var set = new HashSet<Integer>();
            for (int i = 0; i < A.length; i++) {
                if (set.contains(A[i])) {
                    set.remove(A[i]);
                } else {
                    set.add(A[i]);
                }
            }
            return set.iterator().next();
        }
    }
}
