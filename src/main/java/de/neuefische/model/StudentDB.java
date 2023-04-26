package de.neuefische.model;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class StudentDB {
    // properties (array of students)
    Map<String, Student> students = new HashMap<>();

    // constructors
    public StudentDB(){}

    public StudentDB(Map<String, Student> students) {
        this.students = students;
    }

    // methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Objects.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public Student randomStudent(){
        int max = students.size();
        int min = 0;
        int randomNumber = (int) (Math.random() * (max - min)) + min;

        return this.students.get(randomNumber);
    }

    public void addStudent(){

    }

    public void removeStudent(){

    }

    // get and set
    public Map<String, Student> getAllStudents() {
        return students;
    }

    public void setAllStudents(Map<String, Student> students) {
        this.students = students;
    }
}
