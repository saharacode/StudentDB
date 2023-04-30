package de.neuefische.model;

import java.util.Objects;

public class ComputerScienceStudent extends Student implements Citizen{
    // properties
    private boolean mathBackground;

    // constructors
    public ComputerScienceStudent() {
    }

    public ComputerScienceStudent(String name, String studentID, String adress, boolean mathBackground) {
        super(name, studentID, adress);
        this.mathBackground = mathBackground;
    }




    // methods
    @Override
    public String getAdress() {
        return getName() + ", " + super.getAdress();
    }

    @Override
    public String getIdentityCard() {
        return super.getStudentID();
    }



    @Override
    public String toString() {
        return "ComputerScienceStudent{" +
                "mathBackground=" + mathBackground +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComputerScienceStudent that = (ComputerScienceStudent) o;
        return mathBackground == that.mathBackground;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), mathBackground);
    }





    // get/set
    public boolean isMathBackground() {
        return mathBackground;
    }

    public void setMathBackground(boolean mathBackground) {
        this.mathBackground = mathBackground;
    }


}
