/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownentity.eulermaven;

/**
 *
 * @author alde
 */
public class Problem14 {
        /*
         * The following iterative sequence is defined for the set of positive integers:
         *
         * n = n/2 (n is even)
         * n = 3n + 1 (n is odd)
         *
         * Using the rule above and starting with 13, we generate the following sequence:
         *
         * 13 -> 40 -> 20 -> 10 -> 5 -> 16 -> 8 -> 4 -> 2 -> 1
         *
         * It can be seen that this sequence (starting at 13 and finishing at 1)
         * contains 10 terms. Although it has not been proved yet (Collatz Problem),
         * it is thought that all starting numbers finish at 1.
         *
         * Which starting number, under one million, produces the count chain?
         *
         * NOTE: Once the chain starts the terms are allowed to go above one million.
         *
         */

        long start = 999999, count = 1, longest = 0, started_at = 0;

        public void showResult() {
                for (long c = start; c > 0; c--) {
                        long n = c;
                        while (n > 1) {
                                count++;
                                if (isEven(n)) {
                                        n = n / 2;
                                } else {
                                        n = 3 * n + 1;
                                }
                        }
                        if (longest < count) {
                                longest = count;
                                started_at = c;
                        }
                        count = 1;
                }
                System.out.println("\nLongest Chain: " + longest + "\nStarted at: " + started_at);

        }

        private boolean isEven(long n) {
                if (n % 2 == 0) {
                        return true;
                }
                return false;
        }
}
