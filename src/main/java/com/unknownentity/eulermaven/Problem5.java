/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownentity.eulermaven;

/**
 *
 * @author alde
 */
public class Problem5 {
        /*
         * 2520 is the smallest number that can be divided by each of the
         * numbers from 1 to 10 without any remainder.
         *
         * What is the smallest positive number that is evenly divisible by
         * all of the numbers from 1 to 20?
         * 
         */

        void showResult() {
                int rem = 1;
                int tal = 0;
                do {
                        tal++;
                        for (int i = 1; i <= 20; i++) {
                                if (tal % i != 0) {
                                        rem = 1;
                                        break;
                                }
                                rem = 0;
                        }

                } while (rem != 0);
                System.out.println(""+tal);
        }
}
