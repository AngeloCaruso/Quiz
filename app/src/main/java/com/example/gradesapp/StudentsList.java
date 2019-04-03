package com.example.gradesapp;

import java.util.ArrayList;

public class StudentsList {

    private static ArrayList<Student> students = new ArrayList<>();

    public static void addToList(Student student) {
        students.add(student);
    }
    public static ArrayList<Student> listStudents(){
        return students;
    }
}
