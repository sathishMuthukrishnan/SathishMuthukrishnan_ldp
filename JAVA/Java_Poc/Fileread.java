package javaconcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Fileread {

    public static void main(String[] args) throws FileNotFoundException {

        String file = "C:\\Users\\shath\\Downloads\\Polymorphism.txt";
        File  read= new File(file);
        Scanner input = new Scanner(read);
        while (input.hasNextLine()){
            String line = input.nextLine();
            System.out.println(line);

        }


    }
}
