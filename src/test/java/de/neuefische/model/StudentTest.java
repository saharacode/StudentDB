package de.neuefische.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {
    @Test
    void getAllStudents_returnTwoStudents() {
        // given
        Student s1 = new Student(); // doesnt matter which constructor is used
        Student s2 = new Student();
        Student[] expected_array = {s1, s2};
        StudentDB sdb = new StudentDB(expected_array);

        // when
        Student[] actual_array = sdb.getAllStudents();

        // then
        assertArrayEquals(expected_array,actual_array);

    }


    @Test
    void toString_true() {
        // given
        String expected = "StudentDB{students=[Student{name='a', studentID=1, adress='add'}]}";

        Student s1 = new Student("a",1,"add");
        Student[] expected_array = {s1};
        StudentDB sdb = new StudentDB(expected_array);

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
        Student[] expected_array = {s1};
        StudentDB sdb = new StudentDB(expected_array);

        // when
        String actual = sdb.toString();

        // then
        boolean check = expected.equals(actual);
        assertFalse(check);
    }
}