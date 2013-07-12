package com.qsoft.bak.persistence.dao.impl;

import com.qsoft.bak.persistence.dao.GenericDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.persistence.model.GenericDataModel;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/11/13
 * Time: 2:13 PM
 * To change this template use File | Settings | File Templates.
 */
@Transactional
public abstract class GenericDAOImpl implements GenericDAO
{
    @PersistenceContext
    protected EntityManager entityManager;

    @Override
    public void create(GenericDataModel dataModel)
    {
        entityManager.persist(dataModel);
    }

    @Override
    public void update(GenericDataModel dataModel)
    {
        entityManager.merge(dataModel);
    }

    @Override
    public void delete(Class clazz, GenericDataModel dataModel)
    {
        entityManager.remove(dataModel);
    }
}
