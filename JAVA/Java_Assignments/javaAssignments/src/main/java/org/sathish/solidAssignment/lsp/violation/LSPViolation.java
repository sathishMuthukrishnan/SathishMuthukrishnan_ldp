package org.lsp.violation;

abstract class Bird {
    public abstract void fly();
    public abstract void makeSound();
}

class Sparrow extends Bird {
    public void fly() {
        System.out.println("Sparrow is flying");
    }

    public void makeSound() {
        System.out.println("Sparrow chirps");
    }
}

class Penguin extends Bird {
    public void fly() {
        throw new UnsupportedOperationException("Penguin can't fly");
    }

    public void makeSound() {
        System.out.println("Penguin honks");
    }
}

class LspViolationMain {
    public static void main(String[] args) {
        Bird bird = new Penguin();
        bird.fly(); // Throws exception - violates LSP
        bird.makeSound();
    }
}