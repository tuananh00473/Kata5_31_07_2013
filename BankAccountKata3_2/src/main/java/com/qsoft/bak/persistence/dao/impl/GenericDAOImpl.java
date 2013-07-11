package com.qsoft.bak.persistence.dao.impl;

import com.qsoft.bak.persistence.dao.GenericDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/11/13
 * Time: 2:13 PM
 * To change this template use File | Settings | File Templates.
 */
public abstract class GenericDAOImpl implements GenericDAO
{
    @Override
    public void openNewAccount(BankAccountDTO bankAccountDTO)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public BankAccountDTO findAccount(Class clazz, Object object)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void saveAccount(BankAccountDTO bankAccountDTO)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void deleteAccount(Class clazz, Object object)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }
}
