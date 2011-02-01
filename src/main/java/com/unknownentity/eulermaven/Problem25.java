package com.unknownentity.eulermaven;

public class Problem25 {
        /*
         * The Fibonacci sequence is defined by the recurrence relation:
         *
         * Fn = Fn1 + Fn2, where F1 = 1 and F2 = 1.
         *
         * Hence the first 12 terms will be:
         * F1 = 1
         * F2 = 1
         * F3 = 2
         * F4 = 3
         * F5 = 5
         * F6 = 8
         * F7 = 13
         * F8 = 21
         * F9 = 34
         * F10 = 55
         * F11 = 89
         * F12 = 144
         * The 12th term, F12, is the first term to contain three digits.
         *
         * What is the first term in the Fibonacci sequence to contain 1000 digits?
         *
         */

        private int size = 1000;

        void showResult() {
                Integer id = fibonacci();
                System.out.println("First Fibonacci number with " + size + " digits is number " + id);
        }

        /*
         *  n-th fibonacci number is first with d numbers :  Fn = (d − 1 + log10(5) /2) / log10(phi)
         */

        private int fibonacci() {
                double root5 = Math.sqrt(5);
                double phi = (1+root5)/2;
                Double position = Math.ceil((size-1+Math.log10(5)/2)/Math.log10(phi));
                return position.intValue();
        }
}
