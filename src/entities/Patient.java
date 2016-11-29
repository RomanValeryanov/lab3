package entities;

import java.util.List;

/**
 * entities.Patient class
 * @author Chernyshov Daniil
 */
public class Patient extends Person {
    private List<Diagnosis> diagnosisList;

    public List<Diagnosis> getDiagnosisList() {
        return diagnosisList;
    }

    public void setDiagnosisList(List<Diagnosis> diagnosisList) {
        this.diagnosisList = diagnosisList;
    }
}
