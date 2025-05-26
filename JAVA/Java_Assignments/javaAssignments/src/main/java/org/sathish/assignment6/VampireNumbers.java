package org.sathish.assignment6;

    import java.util.*;

    public class VampireNumbers {

        // Function to check if a number is a vampire number
        public static boolean isVampire(int num) {
            String numStr = String.valueOf(num);
            int len = numStr.length();

            if (len % 2 != 0) return false; // Must have even number of digits

            int half = len / 2;

            // Calculate start and end
            int start = 1;
            for (int i = 1; i < half; i++) {
                start *= 10;
            }
            int end = start * 10;

            // Loop through possible two numbers
            for (int x = start; x < end; x++) {
                if (num % x != 0) continue; // x must divide num evenly
                int y = num / x;

                if (y < start || y >= end) continue; // y must also have half digits
                if (x % 10 == 0 && y % 10 == 0) continue; // Both numbers can't end with 0

                // Combine digits of x and y
                String fangStr = String.valueOf(x) + String.valueOf(y);

                // Convert both to char arrays and sort
                char[] original = numStr.toCharArray();
                char[] combined = fangStr.toCharArray();

                Arrays.sort(original);
                Arrays.sort(combined);

                // Check if sorted digits match
                if (Arrays.equals(original, combined)) return true;
            }

            return false;
        }

        public static void main(String[] args) {
            int count = 0;
            int num = 1000; // Start from first 4-digit number

            while (count < 100) {
                if (isVampire(num)) {
                    System.out.println((count + 1) + ": " + num);
                    count++;
                }
                num++;
            }
        }
    }



