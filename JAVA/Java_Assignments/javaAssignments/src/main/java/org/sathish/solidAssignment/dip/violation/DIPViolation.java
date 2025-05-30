package org.sathish.solidAssignment.dip.violation;

class Sparrow {
    public void train() {
        System.out.println("Training sparrow to fly");
    }
}

class Penguin {
    public void train() {
        System.out.println("Training penguin to swim");
    }
}

class BirdTrainer {
    public void trainBirds() {
        Sparrow sparrow = new Sparrow();
        sparrow.train();

        Penguin penguin = new Penguin();
        penguin.train();
    }
}

public class DIPViolation {
    public static void main(String[] args) {
        BirdTrainer trainer = new BirdTrainer();
        trainer.trainBirds();
    }
}
