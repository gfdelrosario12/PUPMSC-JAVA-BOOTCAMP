package org.javaBootcamp.recentUpdates.records;

public record Person(String name, int age) {
    public String greeting() {
        return "Hello, my name is " + name + " and I am " + age + " years old.";
    }
}