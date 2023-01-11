package com.toptal.algorithms.codility.iterations;

/**
 * <a href="https://app.codility.com/programmers/lessons/1-iterations/binary_gap/">Codility</a>
 */
public class BinaryGap {
    static class Solution {
        public int solution(int N) {
            // Set the return variable
            int longestGap = 0;
            // Set the 2 relatives pointers: front and back
            int backPointer = -1;
            int frontPointer = 0;
            // Start the logic doing the math
            // The remainder represent the bit (0 or 1)
            int remainder = N % 2;
            int quotient = N / 2;
            while (quotient >= 0) {
                if (remainder == 1) {
                    // Calculate the gap only if there was one previous bit equal to 1
                    if (backPointer != -1) {
                        int currentGap = frontPointer - backPointer - 1;
                        if (currentGap > longestGap) {
                            longestGap = currentGap;
                        }
                    }
                    // Always move the back pointer to where the front pointer is if the current bit (remainder) is 1
                    backPointer = frontPointer;
                }
                if (quotient != 0) {
                    remainder = quotient % 2;
                    quotient = quotient / 2;
                    frontPointer++; // Always move the front pointer
                } else {
                    // Avoid infinity loop by verifying if the current quotient is 0
                    // The quotient of 0 / 2 is always 0
                    break;
                }
            }
            return longestGap;
        }
    }
}
