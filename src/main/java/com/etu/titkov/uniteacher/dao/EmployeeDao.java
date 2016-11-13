package com.etu.titkov.uniteacher.dao;

import com.etu.titkov.uniteacher.dao.common.GenericJpaDao;
import com.etu.titkov.uniteacher.entities.EmployeeEntity;
import com.etu.titkov.uniteacher.entities.UnitEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Employee DAO provides specific operations over
 * EmployeeEntity
 *
 * @see EmployeeEntity
 * @see GenericJpaDao
 *
 * @author Evgenii Ray
 */
public class EmployeeDao extends GenericJpaDao<EmployeeEntity, Long> {

    public EmployeeDao() {
        super(EmployeeEntity.class);
    }

    public EmployeeDao(EntityManager manager) {
        super(EmployeeEntity.class);
        setEntityManager(manager);
    }

    /**
     * Finds all employees by provided unit entities
     *
     * @param units - list of unit entities
     *
     * @return - <code>List<EmployeeEntity></code> - of found entities or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<EmployeeEntity> findAllEmployeesByUnits(List<UnitEntity> units) {
        Query query = getEntityManager()
                .createQuery("select x from " + getPersistentClass().getSimpleName() + " x where x.unit IN :units")
                .setParameter("units", units);
        return (List<EmployeeEntity>) query.getResultList();
    }

    /**
     * Finds all employees by provided unit ids
     *
     * @param ids - list of unit ids
     *
     * @return - <code>List<EmployeeEntity></code> - of found entities or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<EmployeeEntity> findAllEmployeesByUnitsIds(List<Long> ids) {
        Query query = getEntityManager()
                .createQuery("select x from " + getPersistentClass().getSimpleName() + " x where x.unit.id IN :ids")
                .setParameter("ids", ids);
        return (List<EmployeeEntity>) query.getResultList();
    }


}
