package com.etu.titkov.uniteacher;


import com.etu.titkov.uniteacher.entities.EmployeeEntity;
import com.etu.titkov.uniteacher.entities.SubjectEntity;
import com.etu.titkov.uniteacher.entities.UnitEntity;
import com.etu.titkov.uniteacher.utils.SessionManager;

import static com.etu.titkov.uniteacher.utils.EntityInputFactory.*;
import static com.etu.titkov.uniteacher.utils.UserInputReader.readInt;

/**
 * Simple CLI GUI which use app controller for performing operations
 *
 * @author Evgenii Ray
 */
public class AppConsole {

    private AppController controller;

    public AppConsole(AppController controller) {
        this.controller = controller;
    }

    /**
     * Shows main menu. Yes, captain ..:)
     */
    public void showMainMenu() {
        System.out.println("\n1) Добавление данных");
        System.out.println("2) Управление сущностями");
        System.out.println("3) Поиск");
        System.out.println("4) Показать всех сотрудников");
        System.out.println("5) Показать все дисциплины");
        System.out.println("6) Показать все поздразделения");
        System.out.println("7) Выход \n");
        System.out.println("Введите пункт меню...");

        switch (readInt()) {
            case 1:
                showDataMenu();
                break;
            case 2:
                assignEntitiesMenu();
                break;
            case 3:
                showSearchMenu();
                break;
            case 4:
                controller.showAllEmployees();
                showMainMenu();
                break;
            case 5:
                controller.showAllSubjects();
                showMainMenu();
                break;
            case 6:
                controller.showAllUnits();
                showMainMenu();
                break;
            case 7:
                SessionManager.terminate();
                //CODACY BUG FIX
                //System.exit(0);
                break;

            default:
                System.out.println("Введен неправильный пункт. Давай еще разок");
                break;
        }
    }

    private void assignEntitiesMenu() {
        System.out.println("..1) Назначить дисциплину на сотрудника(ов)");
        System.out.println("..2) Добавить сотрудника в подразделение");
        System.out.println("..3) << Назад\n");
        System.out.println("Введите пункт меню...");

        switch (readInt()) {
            case 1:
                controller.assignSubjectForEmployee();
                assignEntitiesMenu();
                break;
            case 2:
                controller.assignEmployeeToUnit();
                break;
            case 3:
                showMainMenu();
                break;

            default:
                System.out.println("Введен неправильный пункт. Давай еще разок");
                break;
        }
    }


    private void showSearchMenu() {
        System.out.println("..1) Найти все читаемые дисциплины сотрудником(ами)");
        System.out.println("..2) Найти все читаемые дисциплины сотрудниками по поздразлению(ям)");
        System.out.println("..3) Найти всех сотрудников по поздразделению(ям)");
        System.out.println("..4) << Назад\n");
        System.out.println("Введите пункт меню...");

        switch (readInt()) {
            case 1:
                controller.findAllReadSubjectsByEmployees();
                showSearchMenu();
                break;
            case 2:
                controller.findAllReadSubjectsByUnits();
                showSearchMenu();
                break;
            case 3:
                controller.findAllEmployeesByUnits();
                showSearchMenu();
                break;
            case 4:
                showMainMenu();
                break;

            default:
                System.out.println("Введен неправильный пункт. Давай еще разок");
                break;
        }
    }

    private void showDataMenu() {
        System.out.println("..1) Добавить поздразделение");
        System.out.println("..2) Добавить дисциплину");
        System.out.println("..3) Добавить сотрудника");
        System.out.println("..4) << Назад\n");
        System.out.println("Введите пункт меню...");

        switch (readInt()) {
            case 1:
                UnitEntity unit = createUnit();
                unit = controller.getService().getUnitDao().save(unit);
                System.out.println("\nДобавлено следующее поздразделение: " + unit + "\n");
                showDataMenu();
                break;
            case 2:
                SubjectEntity subject = createSubject();
                subject = controller.getService().getSubjectDao().save(subject);
                System.out.println("\nДобавлен новый предмет: " + subject + "\n");
                showDataMenu();
                break;
            case 3:
                EmployeeEntity emp = createEmployee();
                emp = controller.getService().getEmployeeDao().save(emp);
                System.out.println("\nДобавлен новый работник: " + emp + "\n");
                showDataMenu();
                break;
            case 4:
                showMainMenu();
                break;

            default:
                System.out.println("Введен неправильный пункт. Давай еще разок");
                break;
        }

    }

}
