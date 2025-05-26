package javaconcepts;

import java.util.Scanner;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Enter your name:");
        String  text= input.nextLine();
        System.out.println("Enter your age:");
        int age = input.nextInt();
        System.out.println("your name is: " + text);
        System.out.println("your age is: " + age);


    }

}
