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

}
public static String findKYCWindow(String signupStr, String currentStr) {
    try {
        LocalDate signupDate = LocalDate.parse(signupStr, formatter);
        LocalDate currentDate = LocalDate.parse(currentStr, formatter);

        if (signupDate.isAfter(currentDate)) {
            return "No range";
        }

        LocalDate anniversary = signupDate.withYear(currentDate.getYear());

        if (anniversary.isAfter(currentDate)) {
            anniversary = anniversary.minusYears(1);
        }

        LocalDate startWindow = anniversary.minusDays(30);
        LocalDate endWindow = anniversary.plusDays(30);

        if (endWindow.isAfter(currentDate)) {
            endWindow = currentDate;
        }

        return formatter.format(startWindow) + " " + formatter.format(endWindow);

    } catch (Exception e) {
        return "No range";
    }
}
}