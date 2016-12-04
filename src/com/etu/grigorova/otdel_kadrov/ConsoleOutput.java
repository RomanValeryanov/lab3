package com.etu.grigorova.otdel_kadrov;


import com.etu.grigorova.otdel_kadrov.entities.EmployeEntity;
import com.etu.grigorova.otdel_kadrov.entities.UnitEntity;
import com.etu.grigorova.otdel_kadrov.helps.SessionManager;

import java.util.Scanner;

import static com.etu.grigorova.otdel_kadrov.ContentCreator.createEmployee;
import static com.etu.grigorova.otdel_kadrov.ContentCreator.createUnit;

/**
 * Simple CLI GUI which use app controller for performing operations
 *
 * @author Alexandra Grigorova
 * (with little help of other students) (((%
 */
public class ConsoleOutput {

    private LabLogic controller;

    public ConsoleOutput (LabLogic controller) {
        this.controller = controller;
    }

    //читаем данные пользователя
    public static int readInt () {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    /**
     * Предметная область: Отдел кадров (контингент сотрудников).
     * Основные предметно-значимые сущности: Сотрудники, Подразделения.
     * <p>
     * Основные предметно-значимые атрибуты сущностей:
     * <p>
     * сотрудники – фамилия, имя, отчество, пол, дата рождения, адрес прописки, должность, подразделение
     * подразделения – название, вид подразделения.
     * <p>
     * Основные требования к функциям системы:
     * 1)выбрать список сотрудников по подразделениям или определенному подразделению; done
     * 2)подсчитать средний возраст сотрудников по подразделениям;
     * 3)выбрать список сотрудников по составу (профессорско-преподавательский состав,
     * учебно-вспомогательный состав,
     * административно-хозяйственный состав и т.п.). не поняла задания. уточнить
     */

    public void showMainMenu () {
        System.out.println("\n" +
                            "1) Добавление данных");
        System.out.println("2) Список сотрудников по критериям");
        System.out.println("3) Список всех сотрудников");
        System.out.println("4) Список всех поздразделений");
        System.out.println("5) Средний возраст сотрудников по подразделениям");
        System.out.println("6) Выход \n");
        System.out.println("Введите пункт меню...");

        switch (readInt()) {
            case 1:
                showDataMenu();
                break;
            case 2:
                controller.findAllEmployeesByUnits();
//                showAllEmployeesByUnits();
                break;
            case 3:
                showAllEmployees();
                break;
            case 4:
                controller.showAllUnits();
                showMainMenu();
                break;
            case 5:
                controller.showAgeUnits();
                showMainMenu();
                break;
            case 6:
                SessionManager.terminate();
                break;
            default:
                System.out.println("YOU WASN'T CORRECT! TRY AGAIN!!! (%");
                break;
        }
    }

    private void showDataMenu () {
        System.out.println("..1) Добавить поздразделение");
        System.out.println("..2) Добавить сотрудника");
        System.out.println("..3) << Назад\n");
        System.out.println("Введите пункт меню...");

        switch (readInt()) {
            case 1:
                UnitEntity unit = createUnit();
                unit = controller.getService().getUnitDao().save(unit);
                System.out.println("\nДобавлено поздразделение: " + unit + "\n");
                showDataMenu();
                break;
            case 2:
                EmployeEntity employee = createEmployee();
                employee = controller.getService().getEmployeeDao().save(employee);
                System.out.println("\nСотрудник: " + employee + " добавлен\n");
                showDataMenu();
                break;
            case 3:
                showMainMenu();
                break;
            default:
                System.out.println("YOU WASN'T CORRECT! TRY AGAIN!!! (%");
                break;
        }

    }

    private void showAllEmployees () {
        controller.showAllEmployees();
        System.out.println("");
        System.out.println("..1) Изменить подразделение для конкретного сотрудника");
        System.out.println("..2) << Назад\n");
        System.out.println("Введите пункт меню...");
        switch (readInt()) {
            case(1):
                controller.assignEmployeeToUnit();
                break;
            case(2):
                showMainMenu();
                break;
            default:
                System.out.println("YOU WASN'T CORRECT! TRY AGAIN!!! (%");
                break;
        }
    }
}