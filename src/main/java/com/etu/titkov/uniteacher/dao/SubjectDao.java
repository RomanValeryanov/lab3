package com.etu.titkov.uniteacher.dao;

import com.etu.titkov.uniteacher.dao.common.GenericJpaDao;
import com.etu.titkov.uniteacher.entities.EmployeeEntity;
import com.etu.titkov.uniteacher.entities.SubjectEntity;
import com.etu.titkov.uniteacher.entities.UnitEntity;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.util.List;

/**
 * Subject DAO provides specific operations over
 * SubjectEntity
 *
 * @see SubjectEntity
 * @see GenericJpaDao
 *
 * @author Evgenii Ray
 */
public class SubjectDao extends GenericJpaDao<SubjectEntity, Long> {

    public SubjectDao() {
        super(SubjectEntity.class);
    }

    public SubjectDao(EntityManager manager) {
        super(SubjectEntity.class);
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
    public List<SubjectEntity> findAllReadSubjectsByEmployees(List<EmployeeEntity> employees) {
        Query query = getEntityManager().createQuery("select s from " + getPersistentClass().getSimpleName() +
                " s join s.employees e where e IN :emp")
                .setParameter("emp", employees);
        return (List<SubjectEntity>) query.getResultList();
    }

    /**
     * Finds all subjects which are read by employees provided ids
     *
     * @param ids - employee ids to find read subjects of
     *
     * @return  - list of found subjects or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<SubjectEntity> findAllReadSubjectsByEmployeesId(List<Long> ids) {
        Query query = getEntityManager().createQuery("select s from " + getPersistentClass().getSimpleName() +
                " s join s.employees e where e.id IN :emp")
                .setParameter("emp", ids);
        return (List<SubjectEntity>) query.getResultList();
    }

    /**
     * Finds all subjects which are read on different units
     *
     * @param units - units ids to find read subjects of
     *
     * @return  - list of found subjects or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<SubjectEntity> findAllReadSubjectsByEmployeeUnits(List<UnitEntity> units) {
        Query query = getEntityManager().createQuery("select s from " + getPersistentClass().getSimpleName() +
                " s join s.employees e where e.unit in :units")
                .setParameter("units", units);
        return (List<SubjectEntity>) query.getResultList();
    }

    /**
     * Finds all subjects which are read on different units
     *
     * @param ids - units ids to find read subjects of
     *
     * @return  - list of found subjects or null otherwise
     */
    @SuppressWarnings("unchecked")
    public List<SubjectEntity> findAllReadSubjectsByEmployeeUnitsIds(List<Long> ids) {
        Query query = getEntityManager().createQuery("select s from " + getPersistentClass().getSimpleName() +
                " s join s.employees e where e.unit.id in :ids")
                .setParameter("ids", ids);
        return (List<SubjectEntity>) query.getResultList();
    }

}
