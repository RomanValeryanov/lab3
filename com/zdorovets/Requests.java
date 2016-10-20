package com.zdorovets;
import java.util.ArrayList;
import java.util.Random;
enum Classroom_types {
    аудитория,
    кабинет,
    лаборатория
}
enum Department_names {
    первый_корпус,
    второй_корпус,
    третий_корпус
}
enum Department_types {
    учебное,
    административное,
    научное
}
/*
 * Requests class
 * Создание объектов, выполнение запросов
 * @author Evgeny Zdorovets
 * Created on 19/10/16
 */
public class Requests {
    private static int MAX_AREA = 100; // максимальная площадь помещения
    private static int class_count = 30; // количество помещений 
    private static int dep_count = 3; // количество подразделений
    private static Classroom[] classrooms;
    private static Department[] departments;
    /*
     * Генерирует значения подразделений
     */
    public static void generateDepartments() {
            Department_names[] names = Department_names.values();
            Department_types[] d_types = Department_types.values();
            departments = new Department[dep_count];
            for (int i = 0; i < dep_count; i++) {
                String name = names[i].toString(); // выбор имени подразделения случ. образом
                String type = d_types[i].toString(); // выбор типа подразделения случ. образом 		
                departments[i] = new Department(name, type);
                System.out.println("Создано подразделение: имя - \"" + name + "\", тип - " + type + " (индекс - " + i + ")");
            }
        }
        /*
         * Генерирует значения помещений
         */
    public static void generateClasses() {
            Classroom_types[] c_types = Classroom_types.values();
            Random random = new Random();
            classrooms = new Classroom[class_count];
            for (int i = 0; i < class_count; i++) {
                int num = i + 1; // выбор номера помещения
                String type = c_types[random.nextInt(c_types.length)].toString(); // выбор типа помещения случ. образом
                float area = random.nextFloat() * MAX_AREA; // выбор площади помещения случ. образом
                int landing_place_count = Math.round(area) / 2; // выбор кол-ва посад. мест помещения
                int department_index = random.nextInt(dep_count); // выбор подразделения помещения случ. образом
                classrooms[i] = new Classroom(num, type, area, landing_place_count, departments[department_index]);
                System.out.println("Создано помещение: номер - " + num + ", тип - " + type + ", площадь - " + area + " кв.м., " +
                    "количество посадочных мест - " + landing_place_count + ", подразделение - " + department_index);
            }
        }
        /*
         * По индексу подразделения выбирает список помещений данного подразделения
         * @param departmentIndex индекс подразделения
         * @return список помещений данного подразделения
         */
    public static ArrayList < Integer > getClassroomNumbersByDepartment(int departmentIndex) {
            ArrayList < Integer > list = new ArrayList < Integer > ();
            for (int j = 0; j < class_count; j++) {
                if (classrooms[j].getDepartment().equals(departments[departmentIndex])) {
                    list.add(j);
                }
            }
            return list;
        }
        /*
         * Выводит список помещений по всем подразделениям
         */
    public static void getClassroomNumbersByDepartments() {
            ArrayList < Integer > list = new ArrayList < Integer > ();
            for (int i = 0; i < dep_count; i++) {
                System.out.println("Подразделение " + i + ":");
                list = getClassroomNumbersByDepartment(i);
                for (int j = 0; j < list.size(); j++)
                    System.out.println("Помещение №" + list.get(j));
            }
        }
        /*
         * Подсчитывает площадь учебных аудиторий по помещениям
         * @return площадь учебных аудиторий по помещениям
         */
    public static int getAreaByClassrooms() {
            int sum = 0;
            for (int i = 0; i < class_count; i++) {
                if (classrooms[i].getType().equals(Classroom_types.аудитория.toString()))
                    sum += classrooms[i].getArea();
            }
            System.out.println("Общая площадь аудиторий - " + sum + " кв.м.");
            return sum;
        }
        /*
         * Подсчитывает площадь всех помещений по учебному заведению
         * @return площадь всех помещений по учебному заведению
         */
    public static int getAllAreas() {
            int sum = 0;
            for (int i = 0; i < class_count; i++) {
                sum += classrooms[i].getArea();
            }
            System.out.println("Общая площадь помещений по всему заведению - " + sum + " кв.м.");
            return sum;
        }
        /*
         * По индексу подразделения подсчитывает количество посадочных мест по подразделениям
         * @param departmentIndex индекс подразделения
         * @return количество посадочных мест по подразделениям
         */
    public static int getLandingPlacesByDepartment(int departmentIndex) {
            int sum = 0;
            for (int j = 0; j < class_count; j++) {
                if (classrooms[j].getDepartment().equals(departments[departmentIndex])) {
                    sum += classrooms[j].getLandingPlaceCount();
                }
            }
            return sum;
        }
        /*
         * Выводит список посадочных мест по подразделениям
         */
    public static void getLandingPlacesByDepartments() {
            int landing_places;
            for (int i = 0; i < dep_count; i++) {
                System.out.print("Подразделение " + i + ": ");
                landing_places = getLandingPlacesByDepartment(i);
                System.out.println("количество посадочных мест - " + landing_places);
            }
        }
        /*
         * Главный метод
         */
    public static void main(String[] args) {
        generateDepartments();
        generateClasses();
        getClassroomNumbersByDepartments();
        getAreaByClassrooms();
        getAllAreas();
        getLandingPlacesByDepartments();
    }
}