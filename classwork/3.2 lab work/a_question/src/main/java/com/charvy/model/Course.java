package com.charvy.model;

public class Course {
    private String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }

    public void showCourse() {
        System.out.println("Course Name: " + courseName);
    }
}
