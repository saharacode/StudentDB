package de.neuefische;

import java.util.Arrays;

public class StudentDB {
    // properties (array of students)
    private Student [] students;

    // constructors
    public StudentDB(){}

    public StudentDB(Student[] students){
        this.students = students;
    }

    // methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Arrays.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(students);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + Arrays.toString(students) +
                '}';
    }

    public Student randomStudent(){
        int max = this.students.length;
        int min = 0;
        int randomNumber = (int) (Math.random() * (max - min)) + min;

        return this.students[randomNumber];
    }

    // get and set
    public Student[] getAllStudents() {
        return students;
    }

    public void setAllStudents(Student[] students) {
        this.students = students;
    }
}
