package org.javaBootcamp.fourPillarsOfOOP.encapsulation;

public class Main {
    public static void main(String[] args) {
        Encapsulation person = new Encapsulation("John Doe", 30);
        System.out.println(person.getName()); // Output: John Doe
        person.setAge(31);
        System.out.println(person.getAge());  // Output: 31
    }
}