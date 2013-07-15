package com.qsoft.bak.persistence.dao.impl;

import com.qsoft.bak.persistence.dao.BankAccountDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.persistence.model.GenericDataModel;

import javax.persistence.Query;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/10/13
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountDAOImpl extends  GenericDAOImpl implements BankAccountDAO
{


    @Override
    public GenericDataModel find(long id)
    {
        return entityManager.find(BankAccountDTO.class,id);
    }

    @Override
    public GenericDataModel find(String accountNumber)
    {
        return entityManager.find(BankAccountDTO.class, accountNumber);
    }

    @Override
    public List<GenericDataModel> getAll()
    {
        Query query = entityManager.createQuery("select bad from BankAccountDTO bad");
        return query.getResultList();
    }
}
