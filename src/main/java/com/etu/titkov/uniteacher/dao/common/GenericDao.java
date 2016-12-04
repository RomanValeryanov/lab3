package com.etu.titkov.uniteacher.dao.common;

import com.etu.titkov.uniteacher.dao.exceptions.DaoStoreException;
import com.etu.titkov.uniteacher.entities.BaseEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Generic interface for implementing basic
 * CRUD operation over entity
 *
 * @param <T> - dao entity class
 * @param <I> - id serializable object
 *
 * @author Evgenii Ray
 */
public interface GenericDao<T extends BaseEntity, I extends Serializable>{


    /**
     * Method finds entity object in database by its id
     *
     * @param id - id of entity
     * @return - <code>null</code> if nothing found and entity otherwise
     */
    T findById(I id);

    /**
     * Method finds all objects of entity in database
     *
     * @return - <code>List<T></code> of entity
     */
    List<T> findAll();

    /**
     * Method saves object in database
     *
     * @param entity - entity to save
     * @return - saved detached entity
     * @throws DaoStoreException - if smth wrong happened :)
     */
    T save(T entity) throws DaoStoreException;

    /**
     * Method deletes entity from database
     *
     * @param entity - удаляемый объект сущности
     * @throws DaoStoreException - if smth wrong happened :)
     */
    void delete(T entity) throws DaoStoreException;

    /**
     * Updates entity in database
     *
     * @param entity - entity to update
     */
    T update(T entity) throws DaoStoreException;

    /**
     * Forces all changes which were made
     * during transaction
     */
    void flush();

    /**
     * Cleans session context
     */
    void clean();


}
