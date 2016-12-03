package com.etu.titkov.uniteacher.entities;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Employee entity - represents employee
 *
 * @author Evgeni Ray
 */
@Entity
@Table(name = "EMPLOYEE")
public class Employee extends BaseEntity {

    @Column(name="FIRST_NAME")
    private String fistName;

    @Column(name="LAST_NAME")
    private String lastName;

    @Column(name="FATHER_NAME")
    private String fatherName;

    @Column(name="POSITION")
    private String position;

    @ManyToOne
    @JoinColumn(name = "UNIT_ID")
    private Unit unit;

    @ManyToMany
    @Cascade(CascadeType.ALL)
    @JoinTable(name="EMP_SUBJECT",
            joinColumns=@JoinColumn(name="EMP_ID", referencedColumnName="ID"),
            inverseJoinColumns=@JoinColumn(name="SUB_ID", referencedColumnName="ID"))
    private List<Subject> subjects = new ArrayList<>();

    public String getFistName() {
        return fistName;
    }

    public void setFistName(String fistName) {
        this.fistName = fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public Unit getUnit() {
        return unit;
    }

    public void setUnit(Unit unit) {
        this.unit = unit;
    }

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjectList) {
        this.subjects = subjectList;
    }

    @Override
    public String toString() {
        return String.format("[Сотрудник ID: %d]: [ ФИО: %s %s %s , Позиция: %s , Подраздение: %s ]",
                getId(),
                fistName,
                lastName,
                fatherName,
                position,
                unit != null ? unit.toString() : "Не указано");
    }
}
