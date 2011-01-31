package com.unknownentity.eulermaven;

class Problem17 {

        private static final String[] tens = {
                "",
                " ten",
                " twenty",
                " thirty",
                " forty",
                " fifty",
                " sixty",
                " seventy",
                " eighty",
                " ninety"
        };
        private static final String[] numbers = {
                "",
                " one",
                " two",
                " three",
                " four",
                " five",
                " six",
                " seven",
                " eight",
                " nine",
                " ten",
                " eleven",
                " twelve",
                " thirteen",
                " fourteen",
                " fifteen",
                " sixteen",
                " seventeen",
                " eighteen",
                " nineteen"
        };

        private String convert1to999(int num) {
                String rem;

                if (num % 100 < 20) {
                        rem = numbers[num % 100];
                        num /= 100;
                } else {
                        rem = numbers[num % 10];
                        num /= 10;

                        rem = tens[num % 10] + rem;
                        num /= 10;
                }
                if (num == 0) {
                        return rem;
                }
                if (!rem.isEmpty()) {
                        return numbers[num] + " hundred and " + rem;
                } else {
                        return numbers[num] + " hundred";
                }
        }

        public String convert(int number) {
                String result = "";
                if (number == 1000) {
                        result = "one thousand";
                } else {
                        String subThousand;
                        subThousand = convert1to999(number);

                        result = result + subThousand;
                }
                return result.replace(" ", "");
        }

        void showResult() {
                int sum = 0;
                for (int i = 1; i <= 1000; i++) {
                        sum += convert(i).length();
                }
                System.out.println("Number of letters 1-1000: " + sum);
        }
}
