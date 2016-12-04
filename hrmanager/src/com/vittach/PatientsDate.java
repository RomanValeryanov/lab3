package com.vittach;

import java.util.Date;

/**
 * Created by VITTACH on 23.10.2016.
 */
public class PatientsDate {
    private Date date;
    private Patient patient;

    public PatientsDate(Date date, Patient patient) {
        this.date = date;
        this.patient = patient;
    }

    public Date getDate() {
        return date;
    }

    public Patient getPatient() {
        return patient;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }
}
