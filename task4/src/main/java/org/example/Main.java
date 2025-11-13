package org.example;

public class Main {
    public static void main(String[] args) {
        Student s1 = new Student("Praneeth", 23, "20BCE7404", "A");
        Teacher t1 = new Teacher("Mr. Ramesh", 40, "Java", 50000);

        // Using polymorphism
        Person p1 = s1;
        Person p2 = t1;

        p1.displayInfo();
        System.out.println("----------------");
        p2.displayInfo();
    }
}