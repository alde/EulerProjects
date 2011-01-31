/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownentity.eulermaven;

/**
 *
 * @author alde
 */
class Problem6 {
        /*
         * The sum of the squares of the first ten natural numbers is,
         * 1^2 + 2^2 + ... + 10^2 = 385
         *
         * The square of the sum of the first ten natural numbers is,
         *
         * (1 + 2 + ... + 10)^2 = 552 = 3025
         *
         * Hence the difference between the sum of the squares of the first ten natural numbers and the square of the sum is 3025  385 = 2640.
         *
         * Find the difference between the sum of the squares of the first one
         * hundred natural numbers and the square of the sum.
         *
         */

        void showResult() {
                int sum = 0;
                int square = 0;
                for (int i = 1; i <= 100; i++) {
                        sum += i;
                        int temp = i * i;
                        square += temp;
                }
                int sumsquare = sum * sum;
                System.out.println("sumsquare: " + sumsquare);
                System.out.println("squaresum: " + square);
                int foo = sumsquare - square;
                System.out.println("difference: " + foo);
        }
}
