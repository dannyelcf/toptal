package com.toptal.algorithms.codility.arrays;

/**
 * <a href="https://app.codility.com/programmers/lessons/2-arrays/cyclic_rotation/">Codility</a>
 */
public class CyclicRotation {
    static class Solution {
        // O(N)
        public int[] solution(int[] A, int K) {
            int[] arr = new int[A.length];

            for (int i = 0; i < A.length; i++) {
                arr[(i + K) % A.length] = A[i];
            }

            return arr;
        }

        // Calculate the positive remainder between 'i' and 'n'
        private int mod(int i, int n) {
            return ((i % n) + n) % n;
        }

        // O(N + KN)
        public int[] solution2(int[] A, int K) {
            int[] arr = A.clone(); // O(N)
            if (arr.length <= 1) {
                return arr;
            }

            while (K > 0) { // O(K)
                int temp = arr[arr.length - 1]; // Keep the value
                // Loop through the array in reverse order starting from before last position
                for (int i = arr.length - 2; i >= 0; i--) { // O(N)
                    // Copy the value from the current position to the next position
                    arr[i + 1] = arr[i];
                }
                arr[0] = temp; // Assign the last value to the first position
                K--;
            }

            return arr;
        }

        // O(N + (K%N)N)
        public int[] solution3(int[] A, int K) {
            int[] arr = A.clone(); // O(N)
            if (arr.length <= 1) {
                return arr;
            }
            int k = K % arr.length;
            if (k == 0) {
                return arr;
            }

            while (k > 0) { // O(K%N)
                int temp = arr[arr.length - 1]; // Keep the value of the last position
                // Loop through the array in reverse order starting from before last position
                for (int i = arr.length - 2; i >= 0; i--) { // O(N)
                    // Copy the value from the current position to the next position
                    arr[i + 1] = arr[i];
                    // Set i to the previous position: i--
                }
                arr[0] = temp; // Assign the last value to the first position
                k--;
            }

            return arr;
        }
    }
}
