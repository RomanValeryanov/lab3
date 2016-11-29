package com.zdorovets;
/**
 *  ласс дл€ подсчета данных
 * @author Evgeny Zdorovets
 * Created on 29/11/16
 */
public class Counter {
    /**
     * ¬ыводит список помещений по всем подразделени€м
     * @param classCount максимальное кол-во помещений
     * @param depCount максимальное кол-во подразделений
     */
public void getClassroomNumbersByDepartments(int classCount, int depCount) {
		int size;
        for (int i = 0; i < depCount; i++) {
            System.out.println(MainClass.departments[i]);
            size = MainClass.departments[i].getClasses().size();
            for (int j = 0; j < size; j++)
                System.out.println(MainClass.classrooms[MainClass.departments[i].getClasses().get(j)-1]);
        }
    }
    /**
     * ѕодсчитывает площадь учебных аудиторий по помещени€м
     * @param classCount максимальное кол-во помещений
     */
public void getAreaByClassrooms(int classCount) {
        int sum = 0;
        for (int i = 0; i < classCount; i++) {            	
            if (MainClass.classrooms[i].getType().equals(ClassroomType.ј”ƒ»“ќ–»я))
                sum += MainClass.classrooms[i].getArea();
        }
        System.out.println("ќбща€ площадь аудиторий - " + sum + " кв.м.");
    }
    /**
     * ѕодсчитывает площадь всех помещений по учебному заведению
     * @param classCount максимальное кол-во помещений
     */
public void getAllAreas(int classCount) {
        int sum = 0;
        for (int i = 0; i < classCount; i++) {
            sum += MainClass.classrooms[i].getArea();
        }
        System.out.println("ќбща€ площадь помещений по всему заведению - " + sum + " кв.м.");
    }
    /**
     * ѕо индексу подразделени€ подсчитывает количество посадочных мест по подразделени€м
     * @param departmentIndex индекс подразделени€
     * @param classCount максимальное кол-во помещений
     * @return количество посадочных мест по подразделени€м
     */
public int getLandingPlacesByDepartment(int departmentIndex, int classCount) {
        int sum = 0;
        for (int j = 0; j < classCount; j++) {
            if (MainClass.classrooms[j].getDepartment().equals(MainClass.departments[departmentIndex])) {
                sum += MainClass.classrooms[j].getLandingPlaceCount();
            }
        }
        return sum;
    }
    /**
     * ¬ыводит список посадочных мест по подразделени€м
     * @param classCount максимальное кол-во помещений
     * @param depCount максимальное кол-во подразделений
     */
public void getLandingPlacesByDepartments(int classCount, int depCount) {
        int landingPlaces;
        for (int i = 0; i < depCount; i++) {
            System.out.print(MainClass.departments[i]);
            landingPlaces = getLandingPlacesByDepartment(i, classCount);
            System.out.println("количество посадочных мест - " + landingPlaces);
        }
    }
}
