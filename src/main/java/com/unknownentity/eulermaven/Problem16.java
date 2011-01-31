package com.unknownentity.eulermaven;

import java.math.BigInteger;

class Problem16 {

        /*
         * 2^15 = 32768 and the sum of its digits is 3 + 2 + 7 + 6 + 8 = 26.
         * 
         * What is the sum of the digits of the number 2^1000?
         * 
         */
        private Long limit = 1000L;

        void showResult() {
                BigInteger prod = BigInteger.ONE;
                for (Long i = 1L; i <= limit; i++) {
                        BigInteger temp = BigInteger.valueOf(2L);
                        prod = prod.multiply(temp);
                }
                System.out.println("2^"+limit+"= " + prod);
                String s = prod.toString();
                BigInteger sum = BigInteger.ZERO;
                for (char c : s.toCharArray()) {
                        BigInteger temp = BigInteger.valueOf(Long.parseLong(String.valueOf(c)));
                        sum = sum.add(temp);
                }
                System.out.println("Sum: " + sum);
        }
}
