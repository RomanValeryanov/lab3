package com.etu.titkov.uniteacher.dao;

import com.etu.titkov.uniteacher.dao.common.GenericJpaDao;
import com.etu.titkov.uniteacher.entities.Employee;
import com.etu.titkov.uniteacher.entities.Subject;
import com.etu.titkov.uniteacher.entities.Unit;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Subject DAO provides specific operations over
 * Subject
 *
 * @see Subject
 * @see GenericJpaDao
 *
 * @author Evgenii Ray
 */
public class SubjectDao extends GenericJpaDao<Subject, Long> {

    public SubjectDao() {
        super(Subject.class);
    }

    public SubjectDao(EntityManager manager) {
        super(Subject.class);
        setEntityManager(manager);
    }

    /**
     * Finds all subjects which are read by employees
     *
     * @param employees - employees to find read subjects of
     *
     * @return  - list of found subjects or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<Subject> findAllReadSubjectsByEmployees(List<Employee> employees) {
        Query query = getEntityManager().createQuery("select s from " + getPersistentClass().getSimpleName() +
                " s join s.employees e where e IN :emp")
                .setParameter("emp", employees);
        return (List<Subject>) query.getResultList();
    }

    /**
     * Finds all subjects which are read by employees provided ids
     *
     * @param ids - employee ids to find read subjects of
     *
     * @return  - list of found subjects or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<Subject> findAllReadSubjectsByEmployeesId(List<Long> ids) {
        Query query = getEntityManager().createQuery("select s from " + getPersistentClass().getSimpleName() +
                " s join s.employees e where e.id IN :emp")
                .setParameter("emp", ids);
        return (List<Subject>) query.getResultList();
    }

    /**
     * Finds all subjects which are read on different units
     *
     * @param units - units ids to find read subjects of
     *
     * @return  - list of found subjects or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<Subject> findAllReadSubjectsByEmployeeUnits(List<Unit> units) {
        Query query = getEntityManager().createQuery("select s from " + getPersistentClass().getSimpleName() +
                " s join s.employees e where e.unit in :units")
                .setParameter("units", units);
        return (List<Subject>) query.getResultList();
    }

    /**
     * Finds all subjects which are read on different units
     *
     * @param ids - units ids to find read subjects of
     *
     * @return  - list of found subjects or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<Subject> findAllReadSubjectsByEmployeeUnitsIds(List<Long> ids) {
        Query query = getEntityManager().createQuery("select s from " + getPersistentClass().getSimpleName() +
                " s join s.employees e where e.unit.id in :ids")
                .setParameter("ids", ids);
        return (List<Subject>) query.getResultList();
    }

}
