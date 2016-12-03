package com.etu.titkov.uniteacher.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

/**
 * Subject entity - represents Subject
 *
 * @author Evgeni Ray
 */
@Entity
@Table(name = "SUBJECT")
public class Subject extends BaseEntity {

    @Column(name = "SUBJECT_NAME")
    private String subjectName;

    @ManyToMany(mappedBy="subjects")
    private List<Employee> employees = new ArrayList<>();

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return String.format("[Дисциплина ID: %d]: [ Название дисциплины: %s ]", getId(), subjectName);
    }
}

