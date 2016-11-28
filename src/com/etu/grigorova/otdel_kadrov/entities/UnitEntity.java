package com.etu.grigorova.otdel_kadrov.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table (name = "UNIT")
public class UnitEntity extends OriginEntity {

    @Column (name = "UNIT_NAME", length = 50, nullable = false)
    private String unitName;

    @Column (name = "UNIT_TYPE", length = 50, nullable = false)
    private String unitType;

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
        return String.format("[Подразделение ID: %d] Название: %s; Тип: %s;", getId(), unitName, unitType);
    }
}
