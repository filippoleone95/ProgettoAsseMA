package org.example;

public class Solution {
    private Solution() {}

    public static int solution (String s) {
        int WordMaxLenght = -1;

        if (s != null && !s.isEmpty() ) {

            String [] splitted = s.split(" ");
            int NWords = splitted.length;

            for ( int i = 0; i < NWords; i++) {

                if (splitted[i].matches("^[a-zA-Z0-9]*$") == true) {
                    int countDigit = 0;

                    for (int j = 0; j < splitted[i].length(); j++) {

                        if (Character.isDigit(splitted[i].charAt(j)) == true) {
                            countDigit++;
                        }
                    }

                    if ( (countDigit % 2) == 0 ) {
                        continue;
                    }

                    int countChar = 0;

                    for (int j = 0; j < splitted[i].length(); j++) {
                        if (Character.isLetter(splitted[i].charAt(j)) == true) {
                            countChar++;
                        }
                    }

                    if ( (countChar % 2) != 0) {
                        continue;
                    }

                    if ( WordMaxLenght < splitted[i].length()) {
                        WordMaxLenght = splitted[i].length();
                    }
                }
            }
        }
        return WordMaxLenght;
    }
}