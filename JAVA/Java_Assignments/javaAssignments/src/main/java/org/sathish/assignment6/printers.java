package org.sathish.assignment6;

class MessagePrinter {
    // Constructor that prints a message when an object is created
    public MessagePrinter(String message) {
        System.out.println("Constructor called with message: " + message);
    }
}

public class printers {
    public static void main(String[] args) {
        // Create an array to hold MessagePrinter object references
        MessagePrinter[] print = new MessagePrinter[5];


        System.out.println("Array created.");

        // Print the default values in the array
        for (int i = 0; i < print.length; i++) {
            System.out.println("printers[" + i + "] = " + print[i]);

        }

            }
}

