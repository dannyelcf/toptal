package com.toptal.algorithms.codility.timecomplexity;

public class PermMissingElem {
    public int solution(int[] A) {
        int n = A.length + 1;
        long gaussianSum = (long) ((n / 2.0) * (1 + n));
        long aSum = 0;
        for (int a : A) {
            aSum += a;
        }
        return (int) (gaussianSum - aSum);
    }
}
