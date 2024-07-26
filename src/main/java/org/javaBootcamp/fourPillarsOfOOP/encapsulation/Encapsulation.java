package org.javaBootcamp.fourPillarsOfOOP.encapsulation;

public class Encapsulation{
    private String name; // Private attribute
    private int age;     // Private attribute

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }

    // Constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

