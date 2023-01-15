package com.toptal.algorithms.codility.iterations;

/**
 * <a href="https://app.codility.com/programmers/lessons/1-iterations/binary_gap/">Codility</a>
 * <p>
 * O(log(n) + 1)
 */
public class BinaryGap {
    static class Solution {
        public int solution(int N) {
            // Set the return variable
            int longestGap = 0;
            // Set the 2 relatives pointers: front and back
            int backPointer = -1;
            int frontPointer = 0;

            int remainder;
            int quotient = N; // Set the quotient as the input number
            // O(log(n) + 1)
            do {
                // Start the logic doing the math
                // The remainder represent the bit (0 or 1)
                remainder = quotient % 2;
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
                // Update the quotient and move forward the front pointer
                quotient = quotient / 2;
                frontPointer++;
            } while (quotient > 0);

            return longestGap;
        }
    }
}
