/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.unknownentity.eulermaven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alde
 */
class Problem67 {

        private long maxTriangle() throws IOException {
                long[][] triangle = new long[100][100];
                long max = 0;
                int count = 0;
                try {
                        File file = new File(System.getProperty("user.dir") + "/Problem67.txt");
                        BufferedReader input = new BufferedReader(new FileReader(file));
                        try {
                                String line = null;
                                try {
                                        while ((line = input.readLine()) != null) {
                                                
                                                String[] temp = line.split(" ");
                                                for (int i = 0; i<temp.length; i++) {
                                                        int foo = Integer.parseInt(temp[i]);
                                                        triangle[count][i] = foo;
                                                }
                                                count++;
                                        }
                                } catch (IOException ex) {
                                        Logger.getLogger(Problem67.class.getName()).log(Level.SEVERE, null, ex);
                                }
                        } finally {
                                input.close();
                        }
                } catch (FileNotFoundException ex) {
                        Logger.getLogger(Problem67.class.getName()).log(Level.SEVERE, null, ex);
                }
                for (int i = 1; i < triangle.length; i++) {
                        for (int j = 0; j < triangle[i].length; j++) {
                                if (j == 0) {
                                        triangle[i][j] += triangle[i - 1][j];
                                } else if (j == triangle[i].length - 1) {
                                        triangle[i][j] += triangle[i - 1][triangle[i - 1].length - 1];
                                } else {
                                        long temp = Math.max(triangle[i - 1][j], triangle[i - 1][j - 1]);
                                        triangle[i][j] += temp;
                                }
                                if (i == triangle.length - 1) {
                                        if (triangle[i][j] > max) {
                                                max = triangle[i][j];
                                        }
                                }
                        }
                }
                return max;
        }

        void showResult() {
                try {
                        long ans = maxTriangle();
                        System.out.println("Biggest sum of the path: " + ans);
                } catch (IOException ex) {
                        Logger.getLogger(Problem67.class.getName()).log(Level.SEVERE, null, ex);
                }
        }
}
