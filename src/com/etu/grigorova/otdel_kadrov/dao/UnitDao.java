package com.etu.grigorova.otdel_kadrov.dao;


import com.etu.grigorova.otdel_kadrov.entities.UnitEntity;

import javax.persistence.EntityManager;

/**
 * Unit DAO provides specific operations over
 * UnitEntity
 *
 * @see UnitEntity
 * @see DaoJpa
 *
 * @author Evgenii Ray
 */
public class UnitDao extends DaoJpa<UnitEntity, Integer> {

    public UnitDao() {
        super(UnitEntity.class);
    }
    public UnitDao(EntityManager em) {
        super(UnitEntity.class);
        setEntityManager(em);
    }
}