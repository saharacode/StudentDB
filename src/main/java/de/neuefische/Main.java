package de.neuefische;

import de.neuefische.model.BiologyStudent;
import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.Student;
import de.neuefische.model.StudentDB;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {


        Student s1 = new Student("Johann Dallmann", 1001, "Proskauer Str. 17");
        Student s2 = new Student("Nora Krause", 1002,"Proskauer Str. 17");
        Student s3 = new Student("Oskar Rheinfurth", 1003,"Proskauer Str. 17");
        ArrayList<Student> students = new ArrayList<Student>(3);
        students.add(s1);
        students.add(s2);
        students.add(s3);
        StudentDB sdb = new StudentDB(students);

        System.out.println(sdb.randomStudent());


        /*
        ComputerScienceStudent it1 = new ComputerScienceStudent("Milan Jaritz", 1004, "Proskauer Str. 17", true);
        BiologyStudent bio1 = new BiologyStudent("Carla Essinger", 1005, "Florastr. 88", true);

        System.out.println(it1);
        System.out.println(bio1);
        System.out.println(bio1.getAdress());
        System.out.println(it1.getAdress());

         */
    }
}