package com.vittach;

import com.vittach.enums.Diagnosis;

import java.util.ArrayList;
import java.util.Date;
import java.util.Objects;

/**
 * Created by VITTACH on 22.10.2016.
 */
public class Patient {
    protected Date birthsday;
    protected String lastName;
    protected String firstName;
    protected String patronymic;
    private ArrayList<Diagnosis> diagnos;

    public Patient(String lastName, String firstName, String patronymic, Date birthsday) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.birthsday = birthsday;
        diagnos = new ArrayList<>();
        this.patronymic = patronymic;
    }

    public Date getBirthsday() {
        return birthsday;
    }

    public String getLastName() {

        return lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public ArrayList<Diagnosis> getDiagnos() {
        return diagnos;
    }

    public void addDiagnos(Diagnosis diagnos){
        this.diagnos.add(diagnos);
    }

    public void setBirthsday(Date birthsday) {
        this.birthsday = birthsday;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPatronymic(String patronymic) {
        this.patronymic = patronymic;
    }

    @Override
    public boolean equals(Object obj){
        if (obj == this)
            return true;
        if (!(obj instanceof Patient))
            return false;

        Patient rhs = (Patient) obj;
        return Objects.equals(rhs.lastName, lastName) &&
               Objects.equals(rhs.firstName, firstName) &&
               Objects.equals(rhs.patronymic, patronymic);
    }

    @Override
    public String toString() {
        String info = "";
        info += lastName + " " + firstName + " " + patronymic;
        info += "\nБолезни:";
        for(Diagnosis ill: diagnos)
            info += "\n\t" + ill;
        return info;
    }
}
