/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.unknownentity.eulermaven;

/**
 *
 * @author alde
 */
class Problem7 {

        void showResult() {
                int prime = findPrimeNumber(10001);
                System.out.println("10001th prime: "+prime);
        }

        private boolean isPrime(int n) {
                for (int i=2; i<n; i++) {
                        if (n%i==0) {
                                return false;
                        }
                }
                return true;
        }

        private int findPrimeNumber(int i) {
                int count =0;
                int n = 0;
                while (count <= i) {
                        n++;
                        if (isPrime(n))
                                count++;
                }
                return n;
        }
}
