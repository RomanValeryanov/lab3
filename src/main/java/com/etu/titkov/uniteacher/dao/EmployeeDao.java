package com.etu.titkov.uniteacher.dao;

import com.etu.titkov.uniteacher.dao.common.GenericJpaDao;
import com.etu.titkov.uniteacher.entities.Employee;
import com.etu.titkov.uniteacher.entities.Unit;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Employee DAO provides specific operations over
 * Employee
 *
 * @see Employee
 * @see GenericJpaDao
 *
 * @author Evgenii Ray
 */
public class EmployeeDao extends GenericJpaDao<Employee, Long> {

    public EmployeeDao() {
        super(Employee.class);
    }

    public EmployeeDao(EntityManager manager) {
        super(Employee.class);
        setEntityManager(manager);
    }

    /**
     * Finds all employees by provided unit entities
     *
     * @param units - list of unit entities
     *
     * @return - <code>List<Employee></code> - of found entities or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployeesByUnits(List<Unit> units) {
        Query query = getEntityManager()
                .createQuery("select x from " + getPersistentClass().getSimpleName() + " x where x.unit IN :units")
                .setParameter("units", units);
        return (List<Employee>) query.getResultList();
    }

    /**
     * Finds all employees by provided unit ids
     *
     * @param ids - list of unit ids
     *
     * @return - <code>List<Employee></code> - of found entities or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<Employee> findAllEmployeesByUnitsIds(List<Long> ids) {
        Query query = getEntityManager()
                .createQuery("select x from " + getPersistentClass().getSimpleName() + " x where x.unit.id IN :ids")
                .setParameter("ids", ids);
        return (List<Employee>) query.getResultList();
    }


}
