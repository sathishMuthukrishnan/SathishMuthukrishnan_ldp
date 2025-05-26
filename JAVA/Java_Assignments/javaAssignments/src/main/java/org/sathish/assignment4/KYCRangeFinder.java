package org.sathish.assignment4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class KYCRangeFinder {

    private static final DateTimeFormatter formatter= DateTimeFormatter.ofPattern("dd-MM-yyyy");

    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());


        for (int i = 0; i < n; i++) {
            String[] input = scanner.nextLine().split(" ");
            String result = findKYCWindow(input[0], input[1]);
            System.out.println(result);
        }
        // Closing scanner to prevent resource leak
        scanner.close();

}
    /**
     * This method calculates the KYC window based on signup date and current date.
     * It returns the start and end dates of the KYC update window or "No range" if invalid.
     */
public static String findKYCWindow(String signupStr, String currentStr) {
    try {
        LocalDate signupDate = LocalDate.parse(signupStr, formatter);
        LocalDate currentDate = LocalDate.parse(currentStr, formatter);

        // If signup date is after current date, return no range
        if (signupDate.isAfter(currentDate)) {
            return "No range";
        }
        // Set anniversary to current year
        LocalDate anniversary = signupDate.withYear(currentDate.getYear());
        // If anniversary is after current date, consider previous year
        if (anniversary.isAfter(currentDate)) {
            anniversary = anniversary.minusYears(1);
        }
        // 30 days before and after the anniversary date
        LocalDate startWindow = anniversary.minusDays(30);
        LocalDate endWindow = anniversary.plusDays(30);

        // Adjust end window if it exceeds the current date
        if (endWindow.isAfter(currentDate)) {
            endWindow = currentDate;
        }

        return formatter.format(startWindow) + " " + formatter.format(endWindow);

    } catch (Exception e) {
        return "No range";
    }
}
}
