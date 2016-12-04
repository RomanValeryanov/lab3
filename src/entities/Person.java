package entities;

import java.util.Date;

/**
 * Base entity class
 * @author Chernyshov Daniil
 */
public class Person {
    private String firstName;
    private String lastName;
    private String surName;
    private Date birthDay;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public Date getBirthDay() {
        return birthDay;
    }
}
