package de.neuefische.model;

import java.util.Objects;

public class Student {
    // properties
    private String name;
    private int studentID;

    private String adress;

    //constructors
    public Student(){}

    public Student(String name, int studentID, String adress) {
        this.name = name;
        this.studentID = studentID;
        this.adress = adress;
    }

    // basic methods


    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentID=" + studentID +
                ", adress='" + adress + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return studentID == student.studentID && Objects.equals(name, student.name) && Objects.equals(adress, student.adress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, studentID, adress);
    }

    // get and set
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
