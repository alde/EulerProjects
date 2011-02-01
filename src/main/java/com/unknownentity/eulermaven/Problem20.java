/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownentity.eulermaven;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alde
 */
public class Problem20 {

        void showResult() {
                List<Long> intlist = new ArrayList<Long>();
                for (Long i = 100L; i > 0; i--) {
                        intlist.add(i);
                }
                BigInteger fac = BigInteger.ONE;
                for (Long i : intlist) {
                        BigInteger temp = BigInteger.valueOf(i.longValue());
                        fac = fac.multiply(temp);
                }
                String s = fac.toString();
                BigInteger sum = BigInteger.ZERO;
                for (char c : s.toCharArray()) {
                        BigInteger temp = BigInteger.valueOf(Long.parseLong(String.valueOf(c)));
                        sum = sum.add(temp);
                }
                System.out.println("Sum of digits in 100! : " + sum);
        }
}
