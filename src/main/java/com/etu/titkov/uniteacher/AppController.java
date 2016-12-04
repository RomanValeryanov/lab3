package com.etu.titkov.uniteacher;


import com.etu.titkov.uniteacher.entities.Employee;
import com.etu.titkov.uniteacher.entities.Subject;
import com.etu.titkov.uniteacher.entities.Unit;
import com.etu.titkov.uniteacher.service.DaoDecorator;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static com.etu.titkov.uniteacher.utils.UserInputReader.readInt;
import static com.etu.titkov.uniteacher.utils.UserInputReader.readLine;

/**
 * A controller for CLI program menu. Created for encapsulation all
 * entities business logic.
 *
 * @author etitkov
 * @see DaoDecorator
 */
public class AppController {

    private DaoDecorator service;

    public AppController(DaoDecorator service) {
        this.service = service;
    }

    public void showAllEmployees() {
        System.out.println("\nВсе сотрудники:\n");
        service.getEmployeeDao().findAll().forEach(System.out::println);
    }

    public void showAllSubjects() {
        System.out.println("\nВсе дисциплины:\n");
        service.getSubjectDao().findAll().forEach(System.out::println);
    }

    public void showAllUnits() {
        System.out.println("\nВсе подразделения:\n");
        service.getUnitDao().findAll().forEach(System.out::println);
    }

    /**
     * Provides dialog for assigning subject to employee
     */
    public void assignSubjectForEmployee() {
        System.out.println("\nВыберите дисциплину, которую хотите назначить на сотрудников: \n");
        showAllSubjects();
        Subject subject = service.getSubjectDao().findById((long) readInt());
        System.out.println("\nВыбрана дисциплина: " + subject + "\n");
        if (subject != null) {
            showAllEmployees();
            System.out.println("\nВведите id сотрудников через запятую, кому необходимо назначить дисциплину");
            List<Employee> employees = service.getEmployeeDao().findAllBySeveralIds(parseIds());
            employees.forEach((emp) -> {
                subject.getEmployees().add(emp);
                emp.getSubjects().add(subject);
            });
            service.getEmployeeDao().saveAll(employees);
            System.out.println("\nДисциплина добавлена\n");
        } else {
            System.out.println("\nВведены id несуществующих сотрудников, попробуйте еще раз\n");
        }
    }

    /**
     * Provides dialog for employee to unit
     */
    public void assignEmployeeToUnit() {
        System.out.println("\nВыберите сотрудника, которого нужно добавить в подразделение\n");
        showAllEmployees();
        Employee employee = service.getEmployeeDao().findById((long) readInt());
        if (employee != null) {
            System.out.println("\nВыбран сотрудник: " + employee + "\n");
            System.out.println("\nВыберите подразделение куда нужно добавить сотрудника\n");
            showAllUnits();
            Unit unit = service.getUnitDao().findById((long) readInt());
            if (unit != null) {
                employee.setUnit(unit);
                service.getEmployeeDao().save(employee);
                System.out.println("\nСотрудник успешно добавлен в подразделение\n");
            } else {
                System.out.println("\nВыбранного подразделение не существует, повторите операцию\n");
            }
        } else {
            System.out.println("\nВыбранного сотрудника не существует, повторите операцию\n");
        }
    }

    /**
     * Provides dialog for searching subjects by selected employees
     */
    public void findAllReadSubjectsByEmployees() {
        System.out.println("\nДоступные в базе сотрудники: \n");
        showAllEmployees();
        System.out.println("Введите id интересующих сотрудников через запятую: ");
        List<Long> ids = parseIds();
        System.out.println("\nДисциплины которые ведут эти сотрудники: \n");
        service.getSubjectDao().findAllReadSubjectsByEmployeesId(ids).forEach(System.out::println);
    }

    /**
     * Provides dialog for searching subjects by selected units
     */
    public void findAllReadSubjectsByUnits() {
        System.out.println("\nДоступные в базе подразделения: ");
        showAllUnits();
        System.out.println("\nВведите id интересующих подразделений: ");
        List<Long> ids = parseIds();
        System.out.println("\nДисциплины которые ведутся на этих поздразделениях: \n");
        service.getSubjectDao().findAllReadSubjectsByEmployeesId(ids).forEach(System.out::println);
    }

    /**
     * Provides dialog for searching employees by selected employees
     */
    public void findAllEmployeesByUnits() {
        showAllUnits();
        System.out.println("\nВведите id интересующих подразделений: ");
        List<Long> ids = parseIds();
        System.out.println("\nСотрудники которые работают на этих поздразделениях: \n");
        service.getEmployeeDao().findAllEmployeesByUnitsIds(ids).forEach(System.out::println);
    }

    /**
     * Parses ids in user input string
     *
     * @return - list of ids
     */
    private List<Long> parseIds() {
        return Arrays.stream(readLine().replaceAll("[^\\d,]", "").split(","))
                .map(Long::valueOf)
                .collect(Collectors.toList());
    }

    public DaoDecorator getService() {
        return service;
    }
}
