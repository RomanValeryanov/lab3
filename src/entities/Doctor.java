package entities;

/**
 * entities.Doctor class
 * @author Chernyshov Daniil
 */
public class Doctor extends Person {
    private String position;
    private String specialization;

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
}
