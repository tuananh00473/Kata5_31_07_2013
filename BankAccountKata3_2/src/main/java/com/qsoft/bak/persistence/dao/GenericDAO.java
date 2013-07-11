package com.qsoft.bak.persistence.dao;

import com.qsoft.bak.persistence.model.BankAccountDTO;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/11/13
 * Time: 2:11 PM
 * To change this template use File | Settings | File Templates.
 */
public interface GenericDAO
{
    public void openNewAccount(BankAccountDTO bankAccountDTO);
    public BankAccountDTO findAccount(Class clazz, Object object);
    public void saveAccount(BankAccountDTO bankAccountDTO);
    public void deleteAccount(Class clazz, Object object);
}
