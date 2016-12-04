package com.chernyshov777.entities;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * com.chernyshov777.entities.Patient class
 * @author Chernyshov Daniil
 */
public class Patient extends Person {
    private List<Diagnosis> diagnosisList;

    public Patient(String firstName, String lastName, String surName, Date birthDay) {
        super(firstName, lastName, surName, birthDay);
        diagnosisList = new ArrayList<Diagnosis>();
    }

    public List<Diagnosis> getDiagnosisList() {
        return diagnosisList;
    }

    public void addDiagnosis(Diagnosis diagnosis) {
        diagnosisList.add(diagnosis);
    }
}
