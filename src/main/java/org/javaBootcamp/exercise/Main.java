package org.javaBootcamp.exercise;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Kitty", "Meow");
        Dog dog = new Dog("Buddy", "Woof");

        cat.makeSound();
        cat.tellName();
        dog.makeSound();
        dog.tellName();
    }
}
