package com.chernyshov777.entities;

/**
 * com.chernyshov777.entities.Diagnosis class
 * @author Chernyshov Daniil
 */
public class Diagnosis {
    private String diagnosisName;
    private String description;
    private Doctor appointedBy;

    public Diagnosis() {
    }

    public Diagnosis(String diagnosisName, String description, Doctor appointedBy) {
        this.diagnosisName = diagnosisName;
        this.description = description;
        this.appointedBy = appointedBy;
    }

    public String getDiagnosisName() {
        return diagnosisName;
    }

    public void setDiagnosisName(String diagnosisName) {
        this.diagnosisName = diagnosisName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Doctor getAppointedBy() {
        return appointedBy;
    }

    public void setAppointedBy(Doctor appointedBy) {
        this.appointedBy = appointedBy;
    }
}
