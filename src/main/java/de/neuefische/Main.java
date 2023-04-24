package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Johann Dallmann", 1001);
        Student s2 = new Student("Nora Krause", 1002);
        Student[] students = {s1, s2};
        StudentDB sdb = new StudentDB(students);

        System.out.println(sdb.toString());
    }
}