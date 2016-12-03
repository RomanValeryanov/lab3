package com.etu.titkov.uniteacher.utils;

import com.etu.titkov.uniteacher.entities.Employee;
import com.etu.titkov.uniteacher.entities.Subject;
import com.etu.titkov.uniteacher.entities.Unit;

import static com.etu.titkov.uniteacher.utils.UserInputReader.readLine;

/**
 * Simple entity factory for creating
 * objects from user input. Created just for
 * a convenience
 *
 * @author Evgenii Ray
 */
public class EntityInputFactory {
    public static Unit createUnit(){
        Unit unit = new Unit();
        System.out.println("Введите имя подразделения: ");
        unit.setUnitName(readLine());
        System.out.println("Введите тип подразделения: ");
        unit.setUnitType(readLine());
        return unit;
    }

    public static Employee createEmployee(){
        Employee emp = new Employee();
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

    public static Subject createSubject(){
        Subject subject = new Subject();
        System.out.println("Введите название предмета: ");
        subject.setSubjectName(readLine());
        return subject;
    }

}
