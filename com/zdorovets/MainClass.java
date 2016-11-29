package com.zdorovets;
/**
 * Главный класс входа в приложение
 * Создание объектов, вызов методов
 * @author Evgeny Zdorovets
 * Created on 19/10/16
 */
public class MainClass {
    private static Classroom[] classrooms;
    private static Department[] departments;    
    
    public static Classroom getClassroom(int i){
    	return classrooms[i];
    }
    public static Department getDepartment(int i){
    	return departments[i];
    }
    public static void setClassroom(int i, Classroom classroom){
    	classrooms[i] = classroom;
    }
    public static void setDepartment(int i, Department department){
    	departments[i] = department;
    }
    
    
        /**
         * Главный метод
         */
    public static void main(String[] args) {
    	int maxArea = 0; // максимальная площадь помещения
        int classCount = 0; // количество помещений 
        int depCount = 0; // количество подразделений
        boolean errors = false;
        try {
        	maxArea = Integer.parseInt(args[0]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Не указан первый параметр - максимальная площадь помещения!");
        	errors = true;
        }
        try {
        	classCount = Integer.parseInt(args[1]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Не указан второй параметр - количество помещений!");
        	errors = true;
        }
        try {
        	depCount = Integer.parseInt(args[2]);
        }
        catch(ArrayIndexOutOfBoundsException e) {
        	System.out.println("Не указан третий параметр - количество подразделений!");
        	errors = true;
        }
        if(!errors) {
        	departments = new Department[depCount];
        	classrooms = new Classroom[classCount];
        	Generator g = new Generator();
        	g.generateDepartments(depCount);
        	g.generateClasses(classCount, depCount, maxArea);
        	Counter c = new Counter();
        	c.getClassroomNumbersByDepartments(classCount, depCount);
        	c.getAreaByClassrooms(classCount);
        	c.getAllAreas(classCount);
        	c.getLandingPlacesByDepartments(classCount, depCount);
        }
    }
}