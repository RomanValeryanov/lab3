package com.etu.titkov.uniteacher.entities;

import javax.persistence.*;
import java.util.List;

/**
 * Unit entity - represents Unit
 *
 * @author Evgenii Ray
 */
@Entity
@Table(name = "UNIT")
public class Unit extends BaseEntity {

    @Column(name="UNIT_NAME")
    private String unitName;
    @Column(name="UNIT_TYPE")
    private String unitType;

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "unit")
    private List<Employee> employees;

    public String getUnitName() {
        return unitName;
    }

    public void setUnitName(String unitName) {
        this.unitName = unitName;
    }

    public String getUnitType() {
        return unitType;
    }

    public void setUnitType(String unitType) {
        this.unitType = unitType;
    }

    @Override
    public String toString() {
        return String.format("[Подразделение ID: %d]: [ Название подразделения: %s ]", getId(), unitName);
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
}

