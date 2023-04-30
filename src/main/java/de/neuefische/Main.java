package de.neuefische;

import de.neuefische.model.BiologyStudent;
import de.neuefische.model.ComputerScienceStudent;
import de.neuefische.model.Student;
import de.neuefische.model.StudentDB;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Student s0 = new Student("Johann Dallmann", "0", "Proskauer Str. 17");
        Student s1 = new Student("Nora Krause", "1", "Proskauer Str. 17");
        Student s2 = new Student("Oskar Rheinfurth", "2", "Proskauer Str. 17");
        Map<String, Student> students = new HashMap<String,Student>() {{
            put(s0.getStudentID(), s0);
            put(s1.getStudentID(), s1);
            put(s2.getStudentID(), s2);
        }};
        StudentDB sdb = new StudentDB(students);
        System.out.println(sdb.toString());

        Student randomSt = sdb.randomStudent();
        System.out.println(randomSt.toString());

        /*
        ComputerScienceStudent it1 = new ComputerScienceStudent("Milan Jaritz", "3", "Proskauer Str. 17", true);
        BiologyStudent bio1 = new BiologyStudent("Carla Essinger", "4", "Florastr. 88", true);

        System.out.println(it1);
        System.out.println(bio1);
        System.out.println(bio1.getAdress());
        System.out.println(it1.getAdress());

         */
    }
}