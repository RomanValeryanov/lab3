package com.etu.grigorova.otdel_kadrov;

import com.etu.grigorova.otdel_kadrov.entities.EmployeEntity;
import com.etu.grigorova.otdel_kadrov.entities.UnitEntity;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;


public class ContentCreator {

    public static UnitEntity createUnit () {
        UnitEntity unit = new UnitEntity();
        System.out.println("Введите имя подразделения: ");
        unit.setUnitName(readLine());
        System.out.println("Введите тип подразделения: ");
        unit.setUnitType(readLine());
        return unit;
    }

    public static EmployeEntity createEmployee () {
        EmployeEntity employee = new EmployeEntity();
        System.out.println("Введите имя работника: ");
        employee.setFistName(readLine());
        System.out.println("Введите фамилию работника: ");
        employee.setLastName(readLine());
        System.out.println("Введите отчество работника: ");
        employee.setFatherName(readLine());
        System.out.println("Введите пол работника (М/Ж): ");
        employee.setSex(readLine());
        System.out.println("Введите дату рождения работника\nв формате (ДД-ММ-ГГГГ): ");
        {
            SimpleDateFormat sdf1 = new SimpleDateFormat("dd-mm-yyyy");
            java.util.Date date = null;
            try {
                date = sdf1.parse(readLine());
            } catch (ParseException e) {
                e.printStackTrace();
            }
            java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
            employee.setBirthday(sqlStartDate);
        }
        System.out.println("Введите должность работника: ");
        employee.setPosition(readLine());
        System.out.println("Введите домашний адрес работника: ");
        employee.setAddress(readLine());
        System.out.println();
        return employee;
    }

    public static String readLine () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        try {
            result.append(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }
}
