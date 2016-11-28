package com.etu.grigorova.otdel_kadrov.entities;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table (name = "EMPLOYEE")
public class EmployeEntity extends OriginEntity {

    @Column (name = "FIRST_NAME", length = 50, nullable = false)
    private String fistName;
    public String getFistName () {return fistName;}
    public void setFistName (String fistName) {this.fistName = fistName;}

    @Column (name = "LAST_NAME", length = 50, nullable = false)
    private String lastName;
    public String getLastName () {
        return lastName;
    }
    public void setLastName (String lastName) {
        this.lastName = lastName;
    }

    @Column (name = "FATHER_NAME", length = 50, nullable = false)
    private String fatherName;
    public String getFatherName () {
        return fatherName;
    }
    public void setFatherName (String fatherName) {
        this.fatherName = fatherName;
    }

    @Column (name = "SEX", length = 1)
    private String sex;
    public String getSex () {
        return sex;
    }
    public void setSex (String sex) {
        this.sex = sex;
    }

    @Column (name = "BIRTHDAY",columnDefinition = "DATE")
    private Date birthday;
    public Date getBirthday () {
        return birthday;
    }
    public void setBirthday (Date birthday) {
        this.birthday = birthday;
    }

    @Column (name = "ADDRESS", length = 50, nullable = false)
    private String address;
    public String getAddress () {return address;}
    public void setAddress (String address) {this.address = address;}

    @Column (name = "POSITION", length = 50, nullable = false)
    private String position;
    public String getPosition () {return position;}
    public void setPosition (String position) {this.position = position;}

    @ManyToOne
    @JoinColumn (name = "UNIT_ID")
    private UnitEntity unit;
    public UnitEntity getUnit () {
        return unit;
    }
    public void setUnit (UnitEntity unit) { this.unit = unit;   }


//адрес прописки, должность, подразделение
    @Override
    public String toString () {
        return String.format("[Сотрудник ID: %d] ФИО: %s %s %s; Адрес: %s; Дата рождения: %s; Должность: %s; %s",
                getId(),
                fistName,
                lastName,
                fatherName,
                address,
                birthday,
                position,
                unit != null ? unit.toString() : "Подразделение: Не указано");
    }
}