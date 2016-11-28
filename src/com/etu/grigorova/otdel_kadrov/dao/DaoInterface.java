package com.etu.grigorova.otdel_kadrov.dao;

import com.etu.grigorova.otdel_kadrov.dao.DaoExeption;
import com.etu.grigorova.otdel_kadrov.entities.OriginEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Generic interface for implementing basic
 * Take it from github.com
 *
 * @param <T> - dao entity class
 * @param <I> - id serializable object
 *
 */

public interface DaoInterface<T extends OriginEntity, I extends Serializable> {


    /**
     * Method finds entity object in database by its id
     *
     * @param id - id of entity
     *
     * @return - <code>null</code> if nothing found and entity otherwise
     */
    T findById (I id);

    /**
     * Method saves object in database
     *
     * @param entity - entity to save
     *
     * @return - saved detached entity
     *
     * @throws DaoExeption - for our patience
     */
    T save (T entity) throws DaoExeption;

    /**
     * Method finds all objects of entity in database
     *
     * @return - <code>List<T></code> of entity
     */
    List<T> findAll ();

    /**
     * Updates entity in database
     *
     * @param entity - entity to update
     */
    T update (T entity) throws DaoExeption;

    /**
     * Method deletes entity from database
     *
     * @param entity - entity for deleting
     *
     * @throws DaoExeption - for our patience
     */
    void delete (T entity) throws DaoExeption;

    /**
     * Forces all changes which were made during transaction
     */
    void flush ();

    /**
     * Cleans session context
     */
    void clean ();

}