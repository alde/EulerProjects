package com.unknownentity.eulermaven;

import java.util.ArrayList;
import java.util.List;

class Problem15 {

        /*
         * Starting in the top left corner of a 22 grid, there are 6 routes
         * (without backtracking) to the bottom right corner.
         *  _ _
         * |_|_|
         * |_|_|
         *
         * How many routes are there through a 2020 grid?
         *
         */
        void showResult() {
                long path = getPaths(20, 20);
                System.out.println("Paths: " + path);

        }

        private long getPaths(int row, int col) {

                long[][] grid = new long[row + 1][col + 1];
                int i, j;
                List<Long> paths = new ArrayList<Long>();

                for (i = 0; i <= row; i++) {
                        for (j = 0; j <= i; j++) {
                                grid[i][j] = 0;
                                if (i == j || j == 0) {
                                        grid[i][j] = 1;
                                } else {
                                        grid[i][j] = grid[i - 1][j - 1] + grid[i - 1][j];
                                }
                                if (i == row) {
                                        paths.add(grid[i][j]);
                                }
                        }
                }
                long sum = 0;
                for (long p : paths) {
                        sum += (p * p);
                }
                return sum;
        }
}
