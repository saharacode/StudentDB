package de.neuefische;

public class Main {
    public static void main(String[] args) {

        Student s1 = new Student("Johann Dallmann", 1001);
        Student s2 = new Student("Nora Krause", 1002);
        Student s3 = new Student("Oskar Rheinfurth", 1003);
        Student[] students = {s1, s2, s3};
        StudentDB sdb = new StudentDB(students);

        System.out.println(sdb.randomStudent());
    }
}