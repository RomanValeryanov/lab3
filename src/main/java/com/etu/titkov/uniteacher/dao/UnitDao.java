package com.etu.titkov.uniteacher.dao;

import com.etu.titkov.uniteacher.dao.common.GenericJpaDao;
import com.etu.titkov.uniteacher.entities.Unit;

import javax.persistence.EntityManager;

/**
 * Unit DAO provides specific operations over
 * Unit
 *
 * @see Unit
 * @see GenericJpaDao
 *
 * @author Evgenii Ray
 */
public class UnitDao extends GenericJpaDao<Unit, Long> {

    public UnitDao() {
        super(Unit.class);
    }
    public UnitDao(EntityManager em) {
        super(Unit.class);
        setEntityManager(em);
    }
}
