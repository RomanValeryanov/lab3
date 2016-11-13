package com.etu.titkov.uniteacher.utils;

import com.etu.titkov.uniteacher.entities.EmployeeEntity;
import com.etu.titkov.uniteacher.entities.SubjectEntity;
import com.etu.titkov.uniteacher.entities.UnitEntity;

import static com.etu.titkov.uniteacher.utils.UserInputReader.readLine;

/**
 * Simple entity factory for creating
 * objects from user input. Created just for
 * a convenience
 *
 * @author Evgenii Ray
 */
public class EntityInputFactory {
    public static UnitEntity createUnit(){
        UnitEntity unit = new UnitEntity();
        System.out.println("Введите имя подразделения: ");
        unit.setUnitName(readLine());
        System.out.println("Введите тип подразделения: ");
        unit.setUnitType(readLine());
        return unit;
    }

    public static EmployeeEntity createEmployee(){
        EmployeeEntity emp = new EmployeeEntity();
        System.out.println("Введите имя работника: ");
        emp.setFistName(readLine());
        System.out.println("Введите фамилию работника: ");
        emp.setLastName(readLine());
        System.out.println("Введите отчество работника: ");
        emp.setFatherName(readLine());
        System.out.println("Введите должность работника: ");
        emp.setPosition(readLine());
        return emp;
    }

    public static SubjectEntity createSubject(){
        SubjectEntity subject = new SubjectEntity();
        System.out.println("Введите название предмета: ");
        subject.setSubjectName(readLine());
        return subject;
    }

}
