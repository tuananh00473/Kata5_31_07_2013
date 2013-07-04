package com.qsoft.bak.persistence.dao.impl;

import com.qsoft.bak.persistence.dao.TransactionDAOInterface;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.ui.control.BankAccount;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/3/13
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDAO implements TransactionDAOInterface
{
    BankAccountDAO bankAccountDAO = new BankAccountDAO();
    public void deposite(String accountNumber, long amount, String desciption)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    public void withdraw(String accountNumber, long amount, String desciption)
    {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void changeBalance(String accountNumber, long amount, String desciption)
    {
        if (amount == 0)
        {
            return;
        }
        else
        {
            BankAccountDTO account = bankAccountDAO.getAccount(accountNumber);
            account.setBalance(account.getBalance() + amount);
            bankAccountDAO.save(account);
            save(accountNumber, account.getBalance(), amount, desciption);
        }
    }

    @Override
    public void save(String accountNumber, long balance, long amount, String desciption)
    {
        //persist.
    }
}
