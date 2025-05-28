package org.sathish.solidAssignment.isp.correct;

interface Flyable {
    void fly();
}

interface Swimmable {
    void swim();
}

interface Soundable {
    void makeSound();
}

class Sparrow implements Flyable, Soundable {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void makeSound() {
        System.out.println("Sparrow is chirping");
    }
}

class Penguin implements Swimmable, Soundable {
    public void swim() {
        System.out.println("Penguin is swimming");
    }

    public void makeSound() {
        System.out.println("Penguin is honking");
    }
}

public class ISPCorrect {
    public static void main(String[] args) {
        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.makeSound();

        Penguin penguin = new Penguin();
        penguin.swim();
        penguin.makeSound();
    }
}
