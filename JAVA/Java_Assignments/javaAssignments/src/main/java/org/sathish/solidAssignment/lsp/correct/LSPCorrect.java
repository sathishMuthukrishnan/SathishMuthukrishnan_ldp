package org.sathish.solidAssignment.lsp.correct;

interface Bird {
    void makeSound();
}

interface Flyable {
    void fly();
}

class Sparrow implements Bird, Flyable {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void makeSound() {
        System.out.println("Sparrow chirps");
    }
}

class Penguin implements Bird {
    public void makeSound() {
        System.out.println("Penguin honks");
    }
}

class LspMain {
    public static void main(String[] args) {
        Bird sparrow = new Sparrow();
        Bird penguin = new Penguin();

        sparrow.makeSound();
        penguin.makeSound();

        Flyable flyingBird = new Sparrow();
        flyingBird.fly(); // Only flyable birds are expected to fly
    }
}
