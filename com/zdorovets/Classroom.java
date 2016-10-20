package com.zdorovets;
/*
 * Classroom class
 * Класс помещения
 * @author Evgeny Zdorovets
 * Created on 19/10/16
 */
public class Classroom {
    private int _number; // номер помещения
    private String _type; // вид помещения
    private float _area; // площадь помещения (кв. м)
    private int _landing_place_count; // количество посадочных мест помещения
    private Department _department; // подразделение
    /*
     * @return номер помещения
     */
    public int getNumber() {
            return _number;
        }
        /*
         * @return вид помещения
         */
    public String getType() {
            return _type;
        }
        /*
         * @return площадь помещения (кв. м)
         */
    public float getArea() {
            return _area;
        }
        /*
         * @return количество посадочных мест помещения
         */
    public int getLandingPlaceCount() {
            return _landing_place_count;
        }
        /*
         * @return подразделение помещения
         */
    public Department getDepartment() {
            return _department;
        }
        /*
         * конструктор с параметрами
         */
    public Classroom(int n, String t, float a, int l, Department d) {
        _number = n;
        _type = t;
        _area = a;
        _landing_place_count = l;
        _department = d;
    }
}