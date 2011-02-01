package com.unknownentity.eulermaven;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Logger;

public class Problem22 {

        private List<String> names;
        private Map<String, Integer> letterValues;

        public Problem22() {
                this.letterValues = new HashMap<String, Integer>();
                this.names = new ArrayList<String>();
                setLetterValues();
        }

        private int getValueOfWord(String word) {
                int sum = 0;
                for (char c : word.toCharArray()) {
                        String s = String.valueOf(c).toUpperCase();
                        sum += letterValues.get(s);
                }
                return sum;
        }

        private void readFile() throws FileNotFoundException, IOException {
                File file = new File(System.getProperty("user.dir") + "/Problem22.txt");
                BufferedReader input = new BufferedReader(new FileReader(file));
                try {
                        String line = null;
                        while ((line = input.readLine()) != null) {
                                String foo = line.replace("\"", "");
                                String[] temp = foo.split(",");
                                names.addAll(Arrays.asList(temp));
                                Collections.sort(names, new CompareStrings());
                        }
                } finally {
                        input.close();
                }
        }

        void showResult() {
                Long sum = 0L;
                int curr = 0;
                try {
                        readFile();
                        for (String s : names) {
                                curr++;
                                int temp = getValueOfWord(s);
                                sum = sum + (temp * curr);
                        }
                        System.out.println("Total Name Score: " + sum);
                } catch (FileNotFoundException ex) {
                        Logger.getLogger(Problem22.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                        Logger.getLogger(Problem22.class.getName()).log(Level.SEVERE, null, ex);
                }
        }

        private void setLetterValues() {
                letterValues.put("A", 1);
                letterValues.put("B", 2);
                letterValues.put("C", 3);
                letterValues.put("D", 4);
                letterValues.put("E", 5);
                letterValues.put("F", 6);
                letterValues.put("G", 7);
                letterValues.put("H", 8);
                letterValues.put("I", 9);
                letterValues.put("J", 10);
                letterValues.put("K", 11);
                letterValues.put("L", 12);
                letterValues.put("M", 13);
                letterValues.put("N", 14);
                letterValues.put("O", 15);
                letterValues.put("P", 16);
                letterValues.put("Q", 17);
                letterValues.put("R", 18);
                letterValues.put("S", 19);
                letterValues.put("T", 20);
                letterValues.put("U", 21);
                letterValues.put("V", 22);
                letterValues.put("W", 23);
                letterValues.put("X", 24);
                letterValues.put("Y", 25);
                letterValues.put("Z", 26);
        }

        private class CompareStrings implements Comparator<String> {

                @Override
                public int compare(String t, String t1) {
                        return t.compareTo(t1);
                }
        }
}
