package com.etu.titkov.uniteacher.service;

import com.etu.titkov.uniteacher.dao.EmployeeDao;
import com.etu.titkov.uniteacher.dao.SubjectDao;
import com.etu.titkov.uniteacher.dao.UnitDao;
import com.etu.titkov.uniteacher.utils.SessionManager;

import javax.persistence.EntityManager;

/**
 * Dao aggregator uses as service for operating
 * over entities
 *
 * @author Evgenii Ray
 */
public class DaoDecorator {

    private UnitDao unitDao;
    private SubjectDao subjectDao;
    private EmployeeDao employeeDao;

    public DaoDecorator() {
        EntityManager em = SessionManager.getEntityManager();
        unitDao = new UnitDao(em);
        subjectDao = new SubjectDao(em);
        employeeDao = new EmployeeDao(em);
    }

    public UnitDao getUnitDao() {
        return unitDao;
    }

    public SubjectDao getSubjectDao() {
        return subjectDao;
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }



}
