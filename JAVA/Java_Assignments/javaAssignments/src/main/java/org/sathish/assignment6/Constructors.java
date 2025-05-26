package org.sathish.assignment6;

public class Constructors {

    String name;
    int age;

    // First constructor - takes only name
    public Constructors(String name) {
        this(name, 18);  // Calls second constructor with default age
        System.out.println("First constructor called (name only)");
    }

    // Second constructor - takes name and age
    public Constructors(String name, int age) {
        this.name = name;
        this.age = age;
        System.out.println("Second constructor called (name and age)");
    }

    public void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }


    public static void main(String[] args) {
        Constructors p1 = new Constructors("Sathish");         // Calls first constructor -> chains to second
        Constructors p2 = new Constructors("Muthukrishnan", 25);       // Directly calls second constructor

        p1.display();
        p2.display();
    }
}
