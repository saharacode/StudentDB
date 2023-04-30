package de.neuefische.model;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.NoSuchElementException;

import static org.junit.jupiter.api.Assertions.*;

class StudentDBTest {


    @Test
    void getAllStudents_returnTwoStudents() {
        // given
        Student s1 = new Student("Johann","1","Teststreet");
        Student s2 = new Student("Nora", "2","Teststreet");
        Map<String, Student> expected_array = new HashMap<String,Student>(){{
            put(s1.getStudentID(),s1);
            put(s2.getStudentID(),s2);
        }};

        StudentDB sdb = new StudentDB(expected_array);

        // when
        Map<String,Student> actual_array = sdb.getAllStudents();

        // then
        assertEquals(expected_array,actual_array);

    }


    @Test
    void toString_true() {
        // given
        String expected = "StudentDB{students={1=Student{name='a', studentID='1', adress='add'}}}";

        Student s1 = new Student("a","1","add");
        Map<String, Student> expected_array = new HashMap<>();
        expected_array.put(s1.getStudentID(),s1);
        StudentDB sdb = new StudentDB(expected_array);

        // when
        String actual = sdb.toString();

        // then
        assertEquals(expected,actual);

    }

    @Test
    public void findById_ThrowsExceptionWhenStudentNotFound(){
        // given
        Map<String, Student> emptyHashMap = new HashMap<String, Student>();
        StudentDB sdb = new StudentDB(emptyHashMap);
        String givenID = "1";

        // when/then
        try {
            sdb.findById(givenID);
            fail(); // test wird rot, wenn dieser punkt erreicht wird
        } catch (StudentNotFoundException exception) {
            assertTrue(true);
        }
    }

    @Test
    public void findById_correctWhenStudentFound(){
        // given
        Student s1 = new Student("Johann","1","Teststreet");
        Map<String, Student> studentMap = new HashMap<String, Student>();
        studentMap.put(s1.getStudentID(), s1);
        StudentDB sdb = new StudentDB(studentMap);
        String givenID = "1";

        // when/then
        try {
            Student actualStudent = sdb.findById(givenID);
            assertEquals(s1,actualStudent);

        } catch (StudentNotFoundException exception) {
            fail();
        }
    }

    @Test
    public void removeStudentById_TrueWhenStudentIsNotInMapAfterRemoval(){
        // given
        Student s1 = new Student("Johann", "1", "Teststreet");
        Map<String,Student> studentMap = new HashMap<>();
        //studentMap.put(s1.getStudentID(), s1);
        StudentDB sdb = new StudentDB(studentMap);
        sdb.addStudent(s1);
        String removeID = "1";

        // when/then
        try {
            boolean studentRemoved = sdb.removeStudentById(removeID);
            assertTrue(studentRemoved);
        } catch (StudentNotFoundException e){
            fail();
        }

    }

    @Test
    public void removeStudentById_ThrowExceptionWhenStudentNotFound(){
        // given
        Student s1 = new Student("Johann", "1", "Teststreet");
        Map<String,Student> studentMap = new HashMap<>();
        //studentMap.put(s1.getStudentID(), s1);
        StudentDB sdb = new StudentDB(studentMap);
        sdb.addStudent(s1);
        String removeID = "2";

        // when/then
        try {
            boolean studentRemoved = sdb.removeStudentById(removeID);
            fail();
        } catch (StudentNotFoundException e){
            assertTrue(true);
        }

    }

}