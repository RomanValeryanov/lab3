package com.chernyshov777.entities;

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

    /**
     * @param firstName firs name
     * @param lastName  last name
     * @param surName   surname
     * @param birthDay birthday
     */
    public Person(String firstName, String lastName, String surName, Date birthDay) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.surName = surName;
        this.birthDay = birthDay;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getSurName() {
        return surName;
    }

    public Date getBirthDay() {
        return new Date(birthDay.getTime());
    }
}
