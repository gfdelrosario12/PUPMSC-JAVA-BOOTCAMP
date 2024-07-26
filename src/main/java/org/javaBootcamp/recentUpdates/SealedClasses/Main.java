package org.javaBootcamp.recentUpdates.SealedClasses;

public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Car();
        myVehicle.start();

        Bike myBike = new Bike();
        myBike.start();
        myBike.ringBell();
    }
}
