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
        assertEquals(expected_array, actual_array);

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


}