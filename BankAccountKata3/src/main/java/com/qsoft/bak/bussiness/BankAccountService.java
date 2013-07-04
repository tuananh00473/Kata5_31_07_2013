package com.qsoft.bak.bussiness;

import com.qsoft.bak.persistence.dao.impl.BankAccountDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/4/13
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountService implements BankAccountServiceInterface
{
    @Override
    public void find(String accountNumber)
    {
        BankAccountDAO.findAccount(accountNumber);
    }

    @Override
    public void creat(String accountNumber)
    {
        BankAccountDAO.creatAccount(accountNumber);
    }

    @Override
    public void update(BankAccountDTO bankAccountDTO)
    {
        BankAccountDAO.updateAccount(bankAccountDTO);
    }

    @Override
    public void delete(BankAccountDTO bankAccountDTO)
    {
        BankAccountDAO.deleteAccount(bankAccountDTO);
    }

    @Override
    public void delete(String accountNumber)
    {
        BankAccountDAO.deleteAccount(accountNumber);
    }
}
