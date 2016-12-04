package com.chernyshov777;

import com.chernyshov777.entities.Diagnosis;
import com.chernyshov777.entities.Doctor;
import com.chernyshov777.entities.Patient;

import java.util.Date;

/**
 * @author Chernyshov Daniil
 */
public class TestEntities {
    public static void main(String[] args) {
        Doctor doctor1 = new Doctor("fn", "ln", "sn", new Date(), "position");
        Patient patient = new Patient("fn", "ln", "sn", new Date());
        Diagnosis diagnosis = new Diagnosis("diagnosisName", "diagnosis description", doctor1);
        patient.addDiagnosis(diagnosis);
        //очень удобно))
    }
}
