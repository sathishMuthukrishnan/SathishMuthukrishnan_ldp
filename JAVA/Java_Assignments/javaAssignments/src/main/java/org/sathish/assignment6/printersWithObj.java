package org.sathish.assignment6;

class printersDemo{

        // Constructor that prints a message when an object is created
        public printersDemo(String message) {
            System.out.println("Constructor called with message: " + message);
        }
    }

    public class printersWithObj {
        public static void main(String[] args) {
            // Create an array
            printersDemo[] prints = new printersDemo[5];


            System.out.println("Array created.");

            // Print the default values in the array
            for (int i = 0; i < prints.length; i++) {
                // Constructor will be called here
                prints[i] = new printersDemo("Message " + i);
            }
            System.out.println("All objects created.");
        }
    }



