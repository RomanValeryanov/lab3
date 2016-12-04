package com.zdorovets;
/**
 * Класс для подсчета данных
 * @author Evgeny Zdorovets
 * Created on 29/11/16
 */
public class Counter {
    /**
     * Выводит список помещений по всем подразделениям
     * @param classCount максимальное кол-во помещений
     * @param depCount максимальное кол-во подразделений
     */
public void getClassroomNumbersByDepartments(int classCount, int depCount) {
		int size;
        for (int i = 0; i < depCount; i++) {
            System.out.println(MainClass.getDepartment(i));
            size = MainClass.getDepartment(i).getClasses().size();
            for (int j = 0; j < size; j++)
                System.out.println(MainClass.getClassroom(MainClass.getDepartment(i).getClasses().get(j)-1));
        }
    }
    /**
     * Подсчитывает площадь учебных аудиторий по помещениям
     * @param classCount максимальное кол-во помещений
     */
public void getAreaByClassrooms(int classCount) {
        int sum = 0;
        for (int i = 0; i < classCount; i++) {            	
            if (MainClass.getClassroom(i).getType().equals(ClassroomType.АУДИТОРИЯ))
                sum += MainClass.getClassroom(i).getArea();
        }
        System.out.println("Общая площадь аудиторий - " + sum + " кв.м.");
    }
    /**
     * Подсчитывает площадь всех помещений по учебному заведению
     * @param classCount максимальное кол-во помещений
     */
public void getAllAreas(int classCount) {
        int sum = 0;
        for (int i = 0; i < classCount; i++) {
            sum += MainClass.getClassroom(i).getArea();
        }
        System.out.println("Общая площадь помещений по всему заведению - " + sum + " кв.м.");
    }
    /**
     * По индексу подразделения подсчитывает количество посадочных мест по подразделениям
     * @param departmentIndex индекс подразделения
     * @param classCount максимальное кол-во помещений
     * @return количество посадочных мест по подразделениям
     */
public int getLandingPlacesByDepartment(int departmentIndex, int classCount) {
        int sum = 0;
        for (int j = 0; j < classCount; j++) {
            if (MainClass.getClassroom(j).getDepartment().equals(MainClass.getDepartment(departmentIndex))) {
                sum += MainClass.getClassroom(j).getLandingPlaceCount();
            }
        }
        return sum;
    }
    /**
     * Выводит список посадочных мест по подразделениям
     * @param classCount максимальное кол-во помещений
     * @param depCount максимальное кол-во подразделений
     */
public void getLandingPlacesByDepartments(int classCount, int depCount) {
        int landingPlaces;
        for (int i = 0; i < depCount; i++) {
            System.out.print(MainClass.getDepartment(i));
            landingPlaces = getLandingPlacesByDepartment(i, classCount);
            System.out.println("количество посадочных мест - " + landingPlaces);
        }
    }
}