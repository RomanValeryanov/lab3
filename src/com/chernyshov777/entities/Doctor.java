package com.chernyshov777.entities;

import java.util.Date;

/**
 * com.chernyshov777.entities.Doctor class
 * @author Chernyshov Daniil
 */
public class Doctor extends Person {
    private String position;
    public enum Speciality {
        OPTHALMOLOGIST, SURGEON, ENT
    }

    public Speciality speciality;

    public Doctor(String firstName, String lastName, String surName, Date birthDay, String position) {
        super(firstName, lastName, surName, birthDay);
        this.position = position;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }
}
