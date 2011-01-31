/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownentity.eulermaven;

/**
 *
 * @author alde
 */
class Problem9 {

        /*
         * A Pythagorean triplet is a set of three natural numbers, a  b  c, for which,
         *
         * a^2 + b^2 = c^2
         *
         * For example, 3^2 + 4^2 = 9 + 16 = 25 = 5^2.
         *
         * There exists exactly one Pythagorean triplet for which a + b + c = 1000.
         *
         * Find the product abc.
         * 
         */
        private int limit = 1000;

        void showResult() {
                int a = 0, b = 0, c = 0;
                int temp = 0;
                outerloop:
                for (a = 1; a < limit; a++) {
                        for (b = 1; b < limit; b++) {
                                for (c = 1; c < limit; c++) {
                                        if (c + b + a == limit) {
                                                if (c*c == (b*b)+(a*a)) {
                                                        temp = c*b*a;
                                                        break outerloop;
                                                }
                                        }
                                }
                        }
                }
                System.out.println("Pythagorean triplet product: " + temp);
        }
}
