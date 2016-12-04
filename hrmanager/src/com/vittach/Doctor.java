package com.vittach;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by VITTACH on 23.10.2016.
 */
public class Doctor extends Patient {
    private String post;
    private String specialization;

    private ArrayList<PatientsDate> patientsDates;

    public Doctor(String lastName, String firstName, String patronymic, Date birthsday, String post, String specialization) {
        super(lastName, firstName, patronymic, birthsday);
        this.post = post;
        patientsDates = new ArrayList<>();
        this.specialization = specialization;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getSpecialization(){
        return specialization;
    }

    public ArrayList<PatientsDate> getPatient() {
        return patientsDates;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public void addPatient(Patient patient, Date date) {
        patientsDates.add(new PatientsDate(date,patient));
    }

    @Override
    public String toString() {
        return lastName + " " + firstName + " " + patronymic;
    }
}
