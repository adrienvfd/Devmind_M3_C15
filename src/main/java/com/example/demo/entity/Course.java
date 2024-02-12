package com.example.demo.entity;

import java.util.ArrayList;

public class Course {
    public String courseName;
    public Trainer trainer;
    public boolean online;
    public ArrayList<CourseDay> courseDays;

    @Override
    public String toString() {
        return "Course{" +
                "courseName='" + courseName + '\'' +
                ", trainer=" + trainer +
                ", online=" + online +
                ", courseDays=" + courseDays +
                '}';
    }
}
