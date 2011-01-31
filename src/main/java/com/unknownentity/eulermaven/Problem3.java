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
class Problem3 {

        /*
         * The prime factors of 13195 are 5, 7, 13 and 29.
         *
         * What is the largest prime factor of the number 600851475143 ?
         * 
         */
        long limit = 600851475143L;

        void showResult() {
                System.out.print("The prime factors of " + limit + " is: ");
                List<Integer> factors = primeFactors(limit);
                for (int f : factors) {
                        if (f != factors.get(factors.size()-1)) {
                                System.out.print(f + ", ");
                        } else {
                                System.out.println(f + "");
                        }
                }
        }

        public static List<Integer> primeFactors(long n) {
                List<Integer> factors = new ArrayList<Integer>();
                for (int i = 2; i <= n; i++) {
                        while (n % i == 0) {
                                factors.add(i);
                                n /= i;
                        }
                }
                return factors;
        }
}
