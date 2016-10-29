/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab_3;

/**
 * Перечесление полов
 * @author Dron
 */
enum Gender {
    Male,
    Female
}

/**
 * Месяцы
 * @author Dron
 */
enum Month {
    January,
    February,
    March,
    April,
    May,
    June,
    July,
    August,
    September,
    October,
    November,
    December
}

/**
 * Реалшизация класса Сотрудники
 * @author Dron
 */
public class Employee {
    
    class Date {
        int   day;
        Month month;
        int   year;
    }
    
    /* фамилия сотрудника */
    private String p_first_name;
    
    /* имя отчество сотрудника */
    private String p_second_name;
    
    /* пол сотрудника */
    private Gender   p_gender; 
    
    /* дата рождения сотрудника */
    private Date p_born_data;
    
    /* Адрес сотрудника */
    private String p_adress;
    
    /* Должность сотрудника */
    private String p_position;
    
    /* Подразделение сотрудника */
    private String p_division;
    
    /**
     * Получение фамилии сотрудника
     * @return p_first_name фамилия сотрудника
     */
    public String getFirstName()
    {
        return p_first_name;
    }
    
    /**
     * Получение имени и отчества сотрудника
     * @return p_second_name имя отчество сотрудника
     */
    public String getSecondName()
    {
        return p_second_name;
    }
    
    /**
     * Получение пола сотрудника
     * @return p_gender пол сотрудника
     */
    public Gender getGender()
    {
        return p_gender;
    }
    
    /**
     * Получение даты рождения сотрудника
     * @return p_born_data дата рождения сотрудника
     */
    public Date getBornData()
    {
        return p_born_data;
    }
    
    /**
     * Получение адреса сотрудника
     * @return p_adress адрес сотрудника
     */
    public String getAdress()
    {
        return p_adress;
    }
    
    /**
     * Получение должности сотрудника
     * @return p_position должность сотрудника
     */
    public String getPosition()
    {
        return p_position;
    }
    
    /**
     * Получение подразделения сотрудника
     * @return p_division подразделение сотрудника
     */
    public String getDivision()
    {
        return p_division;
    }
    
    /**
     * Задание фамилии сотрудника
     * @param first_name фамилия сотрудника
     */
    public void getFirstName(String first_name)
    {
        p_first_name = first_name;
    }
    
    /**
     * Задание имени и отчества сотрудника
     * @param second_name имя отчество сотрудника
     */
    public void getSecondName(String second_name)
    {
        p_second_name = second_name;
    }
    
    /**
     * Задание пола сотрудника
     * @param gender пол сотрудника
     */
    public void getGender(Gender gender)
    {
        p_gender = gender;
    }
    
    /**
     * Задание даты рождения сотрудника
     * @param born_data дата рождения сотрудника
     */
    public void getBornData(Date born_data)
    {
        p_born_data = born_data ;
    }
    
    /**
     * Задание адреса сотрудника
     * @param adress адрес сотрудника
     */
    public void getAdress(String adress)
    {
        p_adress = adress;
    }
    
    /**
     * Задание должности сотрудника
     * @param position должность сотрудника
     */
    public void getPosition(String position)
    {
        p_position = position;
    }
    
    /**
     * Задание подразделения сотрудника
     * @param division подразделение сотрудника
     */
    public void getDivision(String division)
    {
        p_division = division;
    }
}
