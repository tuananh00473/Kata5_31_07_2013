package com.qsoft.bak.persistence.dao.impl;

import com.qsoft.bak.persistence.dao.TransactionDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.persistence.model.GenericDataModel;
import com.qsoft.bak.persistence.model.TransactionDTO;

import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/12/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDAOImpl extends GenericDAOImpl implements TransactionDAO
{
    @Override
    public GenericDataModel find(long id)
    {
        return entityManager.find(TransactionDTO.class,id);
    }

    @Override
    public List<GenericDataModel> getAll()
    {
        Query query = entityManager.createQuery("select td from TransactionDTO td");
        return query.getResultList();
    }
}
