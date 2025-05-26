package javaconcepts;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {

        Scanner input= new Scanner(System.in);
        System.out.println("Enter your instruction:");
        String text = input.nextLine();


        switch (text){
            case "Run":
                System.out.println("program is running");
                break;
            case"Stop":
                System.out.println("program is Stopped");
                break;
            default:
                System.out.println("instructions not recognized");

        }
    }
}
