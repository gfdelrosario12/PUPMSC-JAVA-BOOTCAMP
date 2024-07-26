package org.javaBootcamp.recentUpdates.records;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Alice", 30);

        System.out.println("Name: " + person.name());
        System.out.println("Age: " + person.age());
        System.out.println(person.greeting());
    }
}