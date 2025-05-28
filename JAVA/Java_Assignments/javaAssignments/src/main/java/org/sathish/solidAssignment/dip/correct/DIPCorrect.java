package org.sathish.solidAssignment.dip.correct;

interface TrainableBird {
    void train();
}

class Sparrow implements TrainableBird {
    public void train() {
        System.out.println("Training sparrow to fly");
    }
}

class Penguin implements TrainableBird {
    public void train() {
        System.out.println("Training penguin to swim");
    }
}

class BirdTrainer {
    private TrainableBird bird;

    public BirdTrainer(TrainableBird bird) {
        this.bird = bird;
    }

    public void startTraining() {
        bird.train();
    }
}

public class DIPCorrect {
    public static void main(String[] args) {
        TrainableBird sparrow = new Sparrow();
        BirdTrainer trainer1 = new BirdTrainer(sparrow);
        trainer1.startTraining();

        TrainableBird penguin = new Penguin();
        BirdTrainer trainer2 = new BirdTrainer(penguin);
        trainer2.startTraining();
    }
}
