package com.etu.grigorova.otdel_kadrov;


import com.etu.grigorova.otdel_kadrov.entities.EmployeEntity;
import com.etu.grigorova.otdel_kadrov.entities.UnitEntity;
import com.etu.grigorova.otdel_kadrov.dao.DaoDecor;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class LabLogic {

    private DaoDecor service;


    LabLogic (DaoDecor service) {
        this.service = service;
    }

    public void showAllEmployees () {
        System.out.println("\nСотрудники:\n");
        service.getEmployeeDao().findAll().forEach(System.out::println);
    }

    public void showAllUnits () {
        System.out.println("\nПодразделения:\n");
        service.getUnitDao().findAll().forEach(System.out::println);
    }

    public void showAgeUnits () {
        System.out.println("\nСредний возраст сотрудников в подразделениях\n");
        for (UnitEntity currUnit : service.getUnitDao().findAll()) {
            System.out.println(currUnit);

            List<Integer> id = new ArrayList<>();
            id.add(currUnit.getId());

            Integer emplAges = 0;
            int count = 0;
            for (EmployeEntity currEmployee : service.getEmployeeDao().findAllEmployeesByUnitsIds(id)) {
//                List<Integer> employeeAges = new ArrayList<>();
//                employeeAges.add(calculateAge(currEmployee.getBirthday()));
                emplAges += calculateAge(currEmployee.getBirthday());
                count++;
//                System.out.println("возраст: " + calculateAge(currEmployee.getBirthday()));
            }
            if (count == 0) {
                System.out.println("Нет сотрудников");
            } else {
                System.out.println("Средний возраст сотрудников подразделения: "+emplAges/count);
            }


        }
        ConsoleOutput consoleOutput = new ConsoleOutput(this);
        consoleOutput.showMainMenu();
    }

    /**
     * Provides dialog for employee to unit
     */
    public void assignEmployeeToUnit () {
        System.out.println("\nВведите id сотрудника, которого нужно добавить в подразделение\n");
        showAllEmployees();
        System.out.print("id: ");
        EmployeEntity employee = service.getEmployeeDao().findById(readInt());
        if (employee != null) {
            System.out.println("\nВыбран сотрудник: " + employee + "\n");
            showAllUnits();
            System.out.println("\nВыберите id подразделения, куда нужно добавить сотрудника\n");
            System.out.print("id: ");
            UnitEntity unit = service.getUnitDao().findById(readInt());
            if (unit != null) {
                employee.setUnit(unit);
                service.getEmployeeDao().save(employee);
                System.out.println("\nСотрудник успешно добавлен в подразделение\n");
                ConsoleOutput consoleOutput = new ConsoleOutput(this);
                consoleOutput.showMainMenu();
            } else {
                System.out.println("\nВыбранного подразделение не существует, повторите операцию\n");
                assignEmployeeToUnit();
            }
        } else {
            System.out.println("\nВыбранного сотрудника не существует, повторите операцию\n");
            assignEmployeeToUnit();
        }
    }

     public void findAllEmployeesByUnits () {
        showAllUnits();
        System.out.println("\nВведите id интересующих подразделений: ");
        List<Integer> ids = parseIds();
        System.out.println("\nСотрудники которые работают на этих поздразделениях: \n");
        service.getEmployeeDao().findAllEmployeesByUnitsIds(ids).forEach(System.out::println);
        ConsoleOutput consoleOutput = new ConsoleOutput(this);
        consoleOutput.showMainMenu();
    }
    private List<Integer> parseIds () {
        return Arrays.stream(readLine().replaceAll("[^\\d,]", "").split(","))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public DaoDecor getService () {
        return service;
    }

    private static int readInt () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static String readLine () {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        try {
            result.append(reader.readLine());
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result.toString();
    }

    private static Integer calculateAge (final Date birthday) {
        Calendar dob = Calendar.getInstance();
        Calendar today = Calendar.getInstance();

        dob.setTime(birthday);
        // include day of birth
        dob.add(Calendar.DAY_OF_MONTH, -1);

        int age = today.get(Calendar.YEAR) - dob.get(Calendar.YEAR);
        if (today.get(Calendar.DAY_OF_YEAR) <= dob.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }
        return age;
    }
}