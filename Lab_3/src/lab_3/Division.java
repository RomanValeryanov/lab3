/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

enum DivisionType
{
    HR,
    IT,
    PR
}

/**
 *
 * @author Dron
 */
public class Division 
{
    
    /* Название подразделения */
    private String p_division_name;
    
    /* Тип подразделения */
    private DivisionType p_division_type; 
    
    /**
     * Конструктор класса
     * @param division_name
     * @param division_type 
     */
    Division(String division_name, DivisionType division_type)
    {
        p_division_name = division_name;
        p_division_type = division_type;
    }

    /**
     * Получение названия отдела
     * @return p_division_name название отдела
     */
    public String getName()
    {
        return p_division_name;
    }
    
    /**
     * Получение типа отдела
     * @return p_division_type тип отдела
     */
    public DivisionType getDivisionType()
    {
        return p_division_type;
    }
    
}
