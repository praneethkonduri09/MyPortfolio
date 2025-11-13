package org.example;

public abstract class Person {
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getters and Setters (Encapsulation)
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Abstract method (Abstraction)
    public abstract void displayInfo();
}

