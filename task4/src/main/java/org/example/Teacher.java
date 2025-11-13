package org.example;

public class Teacher extends Person {
    private String subject;
    private double salary;

    public Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    public String getSubject() {
        return subject;
    }

    public double getSalary() {
        return salary;
    }

    // Method overriding (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Teacher Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
    }
}

