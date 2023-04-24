package de.neuefische;

public class StudentDB {

    private String name;
    private int studentID;


    // constructors
    public StudentDB(){}

    public StudentDB(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    // methods



    // getter
    public String getName() {
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

    // setter

    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }
}
