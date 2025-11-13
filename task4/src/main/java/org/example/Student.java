package org.example;
public class Student extends Person {
    private String studentId;
    private String grade;

    public Student(String name, int age, String studentId, String grade) {
        super(name, age);
        this.studentId = studentId;
        this.grade = grade;
    }

    public String getStudentId() {
        return studentId;
    }

    public String getGrade() {
        return grade;
    }

    // Method overriding (Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Student Name: " + getName());
        System.out.println("Age: " + getAge());
        System.out.println("Student ID: " + studentId);
        System.out.println("Grade: " + grade);
    }
}
