package de.neuefische.model;

import java.util.*;

public class StudentDB {
    // properties (array of students)
    Map<String, Student> students = new HashMap<>(); // key is the studentID-String




    // constructors
    public StudentDB(){}

    public StudentDB(Map<String, Student> students) {
        this.students = students;
    }




    // methods
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        StudentDB studentDB = (StudentDB) o;
        return Objects.equals(students, studentDB.students);
    }

    @Override
    public int hashCode() {
        return Objects.hash(students);
    }

    @Override
    public String toString() {
        return "StudentDB{" +
                "students=" + students +
                '}';
    }

    public Student randomStudent(){
        int max = students.size();
        int min = 0;
        int randomNumber = (int) (Math.random() * (max - min)) + min;
        String randomNumberStr = Integer.toString(randomNumber);

        return this.students.get(randomNumberStr);
    }


    public Student addStudent(Student student){ // rueckgabewert, damit testbar
        students.put(student.getStudentID(), student); // studentID is the key
        return students.get(student.getStudentID());
    }






    public Student findById(String id) throws StudentNotFoundException {
        if (students.containsKey(id)){
            return students.get(id);
        }
        throw new StudentNotFoundException("No Student with the ID" + id + " found.");
        // Exception muss beim Aufruf (z.b. in main) behandelt werden mit try/catch (koennte auch hier passieren)
    }

    public boolean removeStudentById(String removeID) throws StudentNotFoundException {
        if (students.containsKey(removeID)){ // check if the ID is in Map
            students.remove(removeID);
            if (students.containsKey(removeID)){ // check if student was really removed
                return false;
            }
            return true;
        }
        throw new StudentNotFoundException("No Student with the ID" + removeID + " found.");
    }




    // get and set
    public Map<String, Student> getAllStudents() {
        return students;
    }

    public void setAllStudents(Map<String, Student> students) {
        this.students = students;
    }


}
