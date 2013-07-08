package com.qsoft.bak.persistence.dao.impl;

import com.qsoft.bak.persistence.dao.BankAccountDAOInterface;
import com.qsoft.bak.persistence.model.BankAccountDTO;

import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/2/13
 * Time: 2:23 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountDAO  implements BankAccountDAOInterface
{

    @Override
    public BankAccountDTO openNewAccount(String accountNumber)
    {
        return new BankAccountDTO(accountNumber, 0, new Date());
    }

    @Override
    public BankAccountDTO getAccount(String accountNumber)
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List<BankAccountDTO> getListAllAccount()
    {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void save(BankAccountDTO account)
    {

    }

    public static void deleteAccount(String accountNumber)
    {
        //To change body of created methods use File | Settings | File Templates.
    }

    public static void deleteAccount(BankAccountDTO bankAccountDTO)
    {
        //To change body of created methods use File | Settings | File Templates.
    }

    public static void updateAccount(BankAccountDTO bankAccountDTO)
    {
        //To change body of created methods use File | Settings | File Templates.
    }

    public static void creatAccount(String accountNumber)
    {
        //To change body of created methods use File | Settings | File Templates.
    }

    public static void findAccount(String accountNumber)
    {
        //To change body of created methods use File | Settings | File Templates.
    }
}
