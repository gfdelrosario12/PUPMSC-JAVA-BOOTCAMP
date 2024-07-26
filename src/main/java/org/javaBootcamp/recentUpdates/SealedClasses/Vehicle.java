package org.javaBootcamp.recentUpdates.SealedClasses;

// Define a sealed class with permitted subclasses
public sealed class Vehicle permits Car, Bike {
    public void start() {
        System.out.println("Vehicle started");
    }
}

