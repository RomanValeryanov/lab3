package com.zdorovets;
/*
 * Department class
 * Класс подразделения
 * @author Evgeny Zdorovets
 * Created on 19/10/16
 */
public class Department {
    private String _name; // название подразделения
    private String _type; // вид подразделения
    /*
     * @return имя подразделения
     */
    public String getName() {
            return _name;
        }
        /*
         * @return тип подразделения
         */
    public String getType() {
            return _type;
        }
        /*
         * конструктор с параметрами
         */
    public Department(String n, String t) {
        _name = n;
        _type = t;
    }
}