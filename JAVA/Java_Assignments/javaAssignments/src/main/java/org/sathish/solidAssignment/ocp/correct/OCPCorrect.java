package org.sathish.solidAssignment.ocp.correct;

public class OCPCorrect {

    interface Car {
        String build();
    }

    static class SportsCar implements Car {
        public String build() {
            return "Building a Sports Car";
        }
    }

    static class SUVCar implements Car {
        public String build() {
            return "Building an SUV Car";
        }
    }

    static class CarFactory {
        public void produce(Car car) {
            System.out.println(car.build());
        }
    }

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        factory.produce(new SportsCar());
        factory.produce(new SUVCar());
    }
}
