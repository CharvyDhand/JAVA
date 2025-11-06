package com.charvy.model;

public class Student {
    private Course course;

    // Constructor-based DI
    public Student(Course course) {
        this.course = course;
    }

    public void display() {
        System.out.println("Student is enrolled in:");
        course.showCourse();
    }
}
