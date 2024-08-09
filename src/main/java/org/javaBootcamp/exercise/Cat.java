package org.javaBootcamp.exercise;

public class Cat extends Animal{
    public Cat(String name, String sound) {
        super(name, sound);
    }

    public void makeSound() {
        System.out.println("The cat says " + getSound());
    }

    public void tellName() {
        System.out.println("My name is " + getName() + ".");
    }
}
