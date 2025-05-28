package org.sathish.solidAssignment.ocp.violation;

public class OCPViolation {

    static class CarFactory {
        public void produce(String carType) {
            if (carType.equals("sports")) {
                System.out.println("Building a Sports Car");
            } else if (carType.equals("suv")) {
                System.out.println("Building an SUV Car");
            } else {
                System.out.println("Unknown Car Type");
            }
        }
    }

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        factory.produce("sports");
        factory.produce("suv");
        factory.produce("truck"); // Needs modification to support new type (violation)
    }
}
