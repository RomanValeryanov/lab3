package com.etu.grigorova.otdel_kadrov.dao;

import com.etu.grigorova.otdel_kadrov.entities.EmployeEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Created by zikovam on 19.11.16.
 */


public class EmployeeDao extends DaoJpa<EmployeEntity, Integer> {

    public EmployeeDao () {
        super(EmployeEntity.class);
    }

    public EmployeeDao (EntityManager manager) {
        super(EmployeEntity.class);
        setEntityManager(manager);
    }

    /**
     * Finds all employees by provided unit ids
     *
     * @param ids - list of unit ids
     *
     * @return - <code>List<EmployeeEntity></code> - of found entities or null otherwise
     */
    @SuppressWarnings ("unchecked")
    public List<EmployeEntity> findAllEmployeesByUnitsIds (List<Integer> ids) {
        Query query = getEntityManager()
                .createQuery("select x from " + getPersistentClass().getSimpleName() + " x where x.unit.id IN :ids")
                .setParameter("ids", ids);
        return (List<EmployeEntity>) query.getResultList();
    }
}
