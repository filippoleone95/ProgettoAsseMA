package org.example;

public class Solution {
    private Solution(){}

    public static boolean isPalindromePermutation(String str) {
        if (str == null) {
            return false;
        }

        String sanitizedStr = str.toLowerCase().replaceAll("\\s", "");
        int[] charCount = new int[26];

        for (char c : sanitizedStr.toCharArray()) {
            if (Character.isLetter(c)) {
                int index = c - 'a';
                charCount[index]++;
            }
        }

        int oddCount = 0;

        for (int count : charCount) {
            if (count % 2 != 0) {
                oddCount++;
            }
        }

        if(oddCount <= 1) {
            return true;
        } else {
            return false;
        }
    }
}