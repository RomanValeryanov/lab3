package com.zdorovets;
import java.util.ArrayList;
/** 
 * Department class
 * Класс подразделения
 * @author Evgeny Zdorovets
 * Created on 19/10/16
 */
public class Department {
    private DepartmentName name; // название подразделения
    private DepartmentType type; // вид подразделения
    private int id; // индекс подразделения
    private ArrayList <Integer> classroomList = new ArrayList <Integer> (); // список помещений данного подразделения
    /**
     * @return имя подразделения
     */
    public DepartmentName getName() {
            return name;
        }
    /**
     * @return тип подразделения
     */
    public DepartmentType getType() {
            return type;
        }
    /**
     * @return список помещений
     */
    public ArrayList <Integer> getClasses() {
        return classroomList;
    }
    /**
     * конструктор с параметрами
     */
    public Department(DepartmentName name, DepartmentType type, int id) {
    	this.name = name;
    	this.type = type;
        this.id = id;
    }
    
    @Override
    public String toString() {
        return "Подразделение №"+this.id+":";
    }
}