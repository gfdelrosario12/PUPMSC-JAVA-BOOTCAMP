package org.javaBootcamp.exercise;

public class Dog extends Animal{
    public Dog(String name, String sound) {
        super(name, sound);
    }

    public void makeSound() {
        System.out.println("The dog says " + getSound());
    }

    public void tellName() {
        System.out.println("The name of the dog is " + getName() + ".");
    }
}
