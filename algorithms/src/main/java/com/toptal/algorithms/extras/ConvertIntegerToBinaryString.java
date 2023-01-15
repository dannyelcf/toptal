package com.toptal.algorithms.extras;

import java.util.Deque;
import java.util.LinkedList;
import java.util.stream.Collectors;

/**
 * To convert an integer to its binary representation divide it and its remaining quotients by 2 while the current
 * quotient is greater than 0. Inside this "loop", get the division remainder and push it into a stack. After the loop
 * ends, go through the stack to generate the return string.
 * <p>
 * O(2(log(n) +1))
 */
public class ConvertIntegerToBinaryString {
    static class Solution {
        public String solution(int N) {
            Deque<Integer> stack = new LinkedList<>();

            int remainder;
            int quotient = N; // Set the quotient the input number
            // O(log(n) + 1)
            do {
                remainder = quotient % 2;
                stack.push(remainder);
                // Update the quotient
                quotient = quotient / 2;
            } while (quotient > 0);

            // O(log(n) + 1)
            return stack.stream().map((Object::toString)).collect(Collectors.joining());
        }
    }

}
