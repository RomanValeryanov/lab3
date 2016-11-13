package com.etu.titkov.uniteacher.dao;

import com.etu.titkov.uniteacher.dao.common.GenericJpaDao;
import com.etu.titkov.uniteacher.entities.SubjectEntity;
import com.etu.titkov.uniteacher.entities.UnitEntity;

import javax.persistence.EntityManager;

/**
 * Unit DAO provides specific operations over
 * UnitEntity
 *
 * @see UnitEntity
 * @see GenericJpaDao
 *
 * @author Evgenii Ray
 */
public class UnitDao extends GenericJpaDao<UnitEntity, Long> {

    public UnitDao() {
        super(UnitEntity.class);
    }
    public UnitDao(EntityManager em) {
        super(UnitEntity.class);
        setEntityManager(em);
    }
}
