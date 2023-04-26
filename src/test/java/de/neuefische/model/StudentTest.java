package de.neuefische.model;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    void getAllStudents_returnTwoStudents() {
        // given
        Student s1 = new Student(); // doesnt matter which constructor is used
        Student s2 = new Student();
        ArrayList<Student> expected_arrayList = new ArrayList<>();
        expected_arrayList.add(s1);
        expected_arrayList.add(s2);
        StudentDB sdb = new StudentDB(expected_arrayList);

        // when
        ArrayList<Student> actual_arrayList = sdb.getAllStudents();

        // then
        assertEquals(expected_arrayList,actual_arrayList);

    }


    @Test
    void toString_true() {
        // given
        String expected = "StudentDB{students=[Student{name='a', studentID=1, adress='add'}]}";

        Student s1 = new Student("a",1,"add");
        ArrayList<Student> expected_arrayList = new ArrayList<>();
        expected_arrayList.add(s1);
        StudentDB sdb = new StudentDB(expected_arrayList);

        // when
        String actual = sdb.toString();

        // then
        boolean check = expected.equals(actual);
        assertTrue(check);

    }

    @Test
    void toString_false() {
        // given
        String expected = "StudentDB{students=[Student{name='b', studentID=2}]}";

        Student s1 = new Student("a", 1, "add");
        ArrayList<Student> expected_arrayList = new ArrayList<>();
        expected_arrayList.add(s1);
        StudentDB sdb = new StudentDB(expected_arrayList);

        // when
        String actual = sdb.toString();

        // then
        boolean check = expected.equals(actual);
        assertFalse(check);
    }
}