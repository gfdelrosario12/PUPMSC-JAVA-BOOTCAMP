package org.javaBootcamp.fourPillarsOfOOP.inheritance;

class Animal {
    public String speak() {
        return "Animal speaks";
    }
}

class Dog extends Animal {
    public String bark() {
        return "Woof!";
    }
}

// Usage
public class Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        System.out.println(dog.speak()); // Output: Animal speaks
        System.out.println(dog.bark());  // Output: Woof!
    }
}
