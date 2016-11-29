package com.zdorovets;
/** 
 * Classroom class
 * Класс помещения
 * @author Evgeny Zdorovets
 * Created on 19/10/16
 */
public class Classroom {
    private int number; // номер помещения
    private ClassroomType type; // вид помещения
    private float area; // площадь помещения (кв. м)
    private int landingPlaceCount; // количество посадочных мест помещения
    private Department department; // подразделение
    /**
     * @return номер помещения
     */
    public int getNumber() {
            return number;
        }
        /**
         * @return вид помещения
         */
    public ClassroomType getType() {
            return type;
        }
        /**
         * @return площадь помещения (кв. м)
         */
    public float getArea() {
            return area;
        }
        /**
         * @return количество посадочных мест помещения
         */
    public int getLandingPlaceCount() {
            return landingPlaceCount;
        }
        /**
         * @return подразделение помещения
         */
    public Department getDepartment() {
            return department;
        }
        /**
         * конструктор с параметрами
         */
    public Classroom(int n, ClassroomType t, float a, int l, Department d) {
        number = n;
        type = t;
        area = a;
        landingPlaceCount = l;
        department = d;
    }
    
    @Override
    public String toString() {
        return "Подразделение №"+this.number;
    }
}