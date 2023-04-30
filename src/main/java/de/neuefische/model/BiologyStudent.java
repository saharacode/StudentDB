package de.neuefische.model;

import java.util.Objects;

public class BiologyStudent extends Student implements Citizen {
    // properties
    private boolean chemistryBackground;

    // constructors
    public BiologyStudent() {
    }

    public BiologyStudent(String name, String studentID, String adress, boolean chemistryBackground) {
        super(name, studentID, adress);
        this.chemistryBackground = chemistryBackground;
    }





    // methods
    @Override
    public String getAdress() {
        return getName() + ", " + super.getAdress(); // call parentclass method with super
    }

    @Override
    public String getIdentityCard() {
        return super.getStudentID();
    }

    @Override
    public String toString() {
        return "BiologyStudent{" +
                "chemistryBackground=" + chemistryBackground +
                "} " + super.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        BiologyStudent that = (BiologyStudent) o;
        return chemistryBackground == that.chemistryBackground;
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), chemistryBackground);
    }





    // get/set
    public boolean isChemistryBackground() {
        return chemistryBackground;
    }

    public void setChemistryBackground(boolean chemistryBackground) {
        this.chemistryBackground = chemistryBackground;
    }


}
