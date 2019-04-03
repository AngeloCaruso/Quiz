package com.example.gradesapp;

public class Student {

    private String id, name, lastName;
    private double n1, n2, n3, mean;

    public Student(String id, String name, String lastname, double n1, double n2, double n3) {
        this.id = id;
        this.name = name;
        this.lastName = lastname;
        this.n1 = n1;
        this.n2 = n2;
        this.n3 = n3;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double getN3() {
        return n3;
    }

    public void setN3(double n3) {
        this.n3 = n3;
    }

    public double getMean() {
        return mean;
    }

    public void setMean(){
        this.mean = (this.n1 + this.n2 + this.n3)/3;
    }

    public void addNewStudent(){
        StudentsList.addToList(this);
    }
}
