package de.neuefische;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
    @Test
    void getAllStudents_true() {
        // given
        Student s1 = new Student();
        Student s2 = new Student();
        Student[] expected_array = {s1, s2};
        StudentDB sdb = new StudentDB(expected_array);

        // when
        Student[] actual_array = sdb.getAllStudents();

        // then
        boolean check = expected_array.equals(actual_array);
        assertTrue(check);

    }

    @Test
    void getAllStudents_false() {
        // given
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        Student[] expected_array = {s1, s2};
        Student[] expected_array1 = {s1, s3};
        StudentDB sdb = new StudentDB(expected_array1);

        // when
        Student[] actual_array = sdb.getAllStudents();

        // then
        boolean check = expected_array.equals(actual_array);
        assertFalse(check);

    }

    @Test
    void toString_true() {
        // given
        String expected = "StudentDB{students=[Student{name='a', studentID=1}]}";

        Student s1 = new Student("a",1);
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

        Student s1 = new Student("a",1);
        Student[] expected_array = {s1};
        StudentDB sdb = new StudentDB(expected_array);

        // when
        String actual = sdb.toString();

        // then
        boolean check = expected.equals(actual);
        assertFalse(check);

    }
}