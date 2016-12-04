package com.vittach;

import com.vittach.enums.Post;
import com.vittach.enums.Specialization;

import java.util.Date;
import java.util.ArrayList;

/**
 * Created by VITTACH on 23.10.2016.
 */
public class Doctor extends Patient {
    private Post post;
    private Specialization specialization;

    private ArrayList<PatientsDate> patientsDates;

    public Doctor(String lastName, String firstName, String patronymic, Date birthsday, Post post, Specialization specialization) {
        super(lastName, firstName, patronymic, birthsday);
        this.post = post;
        patientsDates = new ArrayList<>();
        this.specialization = specialization;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }

    public Specialization getSpecialization(){
        return specialization;
    }

    public ArrayList<PatientsDate> getPatient() {
        return patientsDates;
    }

    public void setSpecialization(Specialization specialization) {
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
