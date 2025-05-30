package org.sathish.solidAssignment.isp.violation;

interface Bird {
    void fly();
    void makeSound();
    void swim();
}

class Sparrow implements Bird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void makeSound() {
        System.out.println("Sparrow is chirping");
    }

    public void swim() {
        throw new UnsupportedOperationException("Sparrow can't swim");
    }
}

class Penguin implements Bird {
    public void fly() {
        throw new UnsupportedOperationException("Penguin can't fly");
    }

    public void makeSound() {
        System.out.println("Penguin is honking");
    }

    public void swim() {
        System.out.println("Penguin is swimming");
    }
}

public class ISPViolation {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.fly();
        sparrow.makeSound();
        sparrow.swim(); // Will throw exception (violates ISP)

        penguin.makeSound();
        penguin.swim();
        //penguin.fly(); // Will throw exception (violates ISP)
    }
}
