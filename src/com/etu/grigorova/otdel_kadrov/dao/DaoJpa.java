package com.etu.grigorova.otdel_kadrov.dao;

import com.etu.grigorova.otdel_kadrov.dao.DaoExeption;
import com.etu.grigorova.otdel_kadrov.entities.OriginEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceException;
import javax.persistence.PersistenceContext;
import java.io.Serializable;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Base Generic DAO - object. Represents parent object
 * for all child DAO-object. Determines base operations
 * over entity - aka CRUD operations which are similar
 * for all entities. Specific operation implemented in
 * concrete dao objects
 *
 * @author Evgenii Ray
 * @see DaoInterface
 */
public class DaoJpa<T extends OriginEntity, I extends Serializable> implements DaoInterface<T, I> {

    private static final Logger logger = Logger.getLogger(DaoJpa.class.getName());

    private final Class<T> persistentClass;

    private EntityManager entityManager;

    public DaoJpa (Class<T> persistentClass) {
        this.persistentClass = persistentClass;
    }

    protected EntityManager getEntityManager () {
        return entityManager;
    }

    public Class<T> getPersistentClass () {
        return persistentClass;
    }

    public void setEntityManager (EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    /**
     * Method finds entity object in database by its id
     *
     * @param id - id of entity
     *
     * @return - <code>null</code> if nothing found and entity otherwise
     */
    @Override
    public T findById (I id) {
        return entityManager.find(getPersistentClass(), id);
    }

    /**
     * Methods finds objects with provided ids
     *
     * @param ids - ids of object in DB
     *
     * @return - <code>List<T></code> of found objects
     */
    @SuppressWarnings ("unchecked")
    public List<T> findAllBySeveralIds (List<Integer> ids) {
        return entityManager.createQuery("SELECT x FROM " + getPersistentClass().getSimpleName() + " x WHERE x.id IN :ids")
                .setParameter("ids", ids)
                .getResultList();
    }

    /**
     * Method finds all objects of entity in database
     *
     * @return - <code>List<T></code> of entity
     */
    @SuppressWarnings ("unchecked")
    @Override
    public List<T> findAll () {
        return entityManager
                .createQuery("select x from " + getPersistentClass().getSimpleName() + " x")
                .getResultList();
    }

    /**
     * Method saves object in database
     *
     * @param entity - entity to save
     *
     * @return - saved detached entity
     */
    @Override
    public T save (T entity) {
        try {
            entityManager.getTransaction().begin();
            entityManager.persist(entity);
            entityManager.getTransaction().commit();
        } catch (PersistenceException e) {
            logger.log(Level.SEVERE, "Error happened during persisting an object " + entity, e);
            entityManager.getTransaction().rollback();
        }
        return entity;
    }

    public void saveAll (List<T> entityList) {
        entityList.forEach(this::save);
    }

    /**
     * Method deletes entity from database
     *
     * @param entity - удаляемый объект сущности
     *
     * @throws DaoExeption - if smth wrong happened :)
     */
    @Override
    public void delete (T entity) throws DaoExeption {
        try {
            entityManager.getTransaction().begin();
            if (OriginEntity.class.isAssignableFrom(persistentClass)) {
                entityManager.remove(entityManager.getReference(entity.getClass(), entity.getId()));
            } else {
                T mergedEntity = entityManager.merge(entity);
                entityManager.remove(mergedEntity);
            }
            entityManager.getTransaction().commit();
        } catch (PersistenceException e) {
            logger.log(Level.SEVERE, "Error happened during persisting an object " + entity, e);
            entityManager.getTransaction().rollback();
            throw new DaoExeption(e);
        }
    }

    /**
     * Forces all changes which were made
     * during transaction
     */
    @Override
    public void flush () {
        entityManager.flush();
    }

    /**
     * Cleans session context
     */
    @Override
    public void clean () {
        entityManager.clear();
    }

    /**
     * Updates entity in database
     *
     * @param entity - entity to update
     */
    @Override
    public T update (T entity) throws DaoExeption {
        try {
            entityManager.getTransaction().begin();
            entityManager.merge(entity);
            entityManager.getTransaction().commit();
        } catch (PersistenceException e) {
            logger.log(Level.SEVERE, "Error happened during persisting an object " + entity, e);
            entityManager.getTransaction().rollback();
            throw new DaoExeption(e);
        }
        return entity;
    }

    public void closeSession () {
        entityManager.close();
    }


}