package com.zdorovets;
import java.util.Random;
/**
 * Класс для генерации данных
 * @author Evgeny Zdorovets
 * Created on 29/11/16
 */
public class Generator {
	/**
     * Генерирует значения подразделений
     * @param depCount максимальное кол-во подразделений
     */
    public void generateDepartments(int depCount) {
    	
            DepartmentName[] names = DepartmentName.values();
            DepartmentType[] types = DepartmentType.values();
            MainClass.departments = new Department[depCount];
            for (int i = 0; i < depCount; i++) {		
            	MainClass.departments[i] = new Department(names[i], types[i], i); // выбор имени и типа подразделения по порядку
                System.out.println("Создано подразделение: имя - \"" + names[i] + "\", тип - " + types[i] + " (индекс - " + i + ")");
            }
        }
        /**
         * Генерирует значения помещений
         * @param classCount максимальное кол-во помещений
         * @param depCount максимальное кол-во подразделений
         * @param maxArea максимальная площадь помещения
         */
    public void generateClasses(int classCount, int depCount, int maxArea) {
            ClassroomType[] cTypes = ClassroomType.values();
            Random random = new Random();
            MainClass.classrooms = new Classroom[classCount];
            for (int i = 0; i < classCount; i++) {
                int num = i + 1; // выбор номера помещения
                ClassroomType type = cTypes[random.nextInt(cTypes.length)]; // выбор типа помещения случ. образом
                float area = random.nextFloat() * maxArea; // выбор площади помещения случ. образом
                int landingPlaceCount = Math.round(area) / 2; // выбор кол-ва посад. мест помещения
                int departmentIndex = random.nextInt(depCount); // выбор подразделения помещения случ. образом
                MainClass.classrooms[i] = new Classroom(num, type, area, landingPlaceCount, MainClass.departments[departmentIndex]);
                MainClass.departments[departmentIndex].getClasses().add(num); // добавление помещения в список помещений подразделения
                System.out.println("Создано помещение: номер - " + num + ", тип - " + type + ", площадь - " + area + " кв.м., " +
                    "количество посадочных мест - " + landingPlaceCount + ", подразделение - " + departmentIndex);
            }
        }
}
