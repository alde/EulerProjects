/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownentity.eulermaven;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alde
 */
class Problem10 {

        /*
         * The sum of the primes below 10 is 2 + 3 + 5 + 7 = 17.
         *
         * Find the sum of all the primes below two million.
         *
         */
        private int limit = 2000000;

        void showResult() {
                long sum = 0;
                List<Integer> primes = new ArrayList<Integer>();
                int count = 0;
                for (int i = 2; i < limit; i++) {
                        if (isPrime(i)) {
                                primes.add(i);
                                count++;
                        }
                }
                for (int p : primes) {
                        sum += p;
                }
                System.out.println("Sum of primes under 2000000 : " + sum);
        }

        private boolean isPrime(int n) {
                for (int i = 2; i < n; i++) {
                        if (n % i == 0) {
                                return false;
                        }
                }
                return true;
        }
}
