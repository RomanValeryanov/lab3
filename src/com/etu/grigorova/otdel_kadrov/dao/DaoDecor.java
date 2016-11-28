package com.etu.grigorova.otdel_kadrov.dao;

import com.etu.grigorova.otdel_kadrov.dao.EmployeeDao;
import com.etu.grigorova.otdel_kadrov.dao.UnitDao;
import com.etu.grigorova.otdel_kadrov.helps.SessionManager;

import javax.persistence.EntityManager;

/**
 * Dao aggregator uses as service for operating
 * over entities
 */

public class DaoDecor {

    private UnitDao unitDao;
    private EmployeeDao employeeDao;

    public DaoDecor () {
        EntityManager em = SessionManager.getEntityManager();
        unitDao = new UnitDao(em);
        employeeDao = new EmployeeDao(em);
    }

    public UnitDao getUnitDao () {
        return unitDao;
    }

    public EmployeeDao getEmployeeDao () {
        return employeeDao;
    }


}