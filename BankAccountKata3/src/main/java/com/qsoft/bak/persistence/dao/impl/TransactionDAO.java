package com.qsoft.bak.persistence.dao.impl;

import com.qsoft.bak.persistence.dao.TransactionDAOInterface;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.persistence.model.TransactionDTO;
import com.qsoft.bak.ui.control.BankAccount;

import javax.persistence.EntityManager;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/3/13
 * Time: 1:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDAO implements TransactionDAOInterface
{
    private EntityManager entityManager;
    private BankAccountDAO bankAccountDAO = new BankAccountDAO();
    private final int MINIMUM_BALANCE = 50000;

    public void deposite(String accountNumber, long amount, String desciption)
    {
        BankAccountDTO bankAccountDTO = bankAccountDAO.getAccount(accountNumber);
        if(bankAccountDTO != null){
            changeBalance(accountNumber, amount, desciption);
        }
    }

    public void withdraw(String accountNumber, long amount, String desciption)
    {
        BankAccountDTO bankAccountDTO = bankAccountDAO.getAccount(accountNumber);
        if((bankAccountDTO.getBalance() > amount + MINIMUM_BALANCE) && (amount % MINIMUM_BALANCE == 0)){
            changeBalance(accountNumber, amount, desciption);
        }
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
            TransactionDTO transactionDTO = new TransactionDTO(accountNumber, account.getBalance(), amount, desciption);
            save(transactionDTO);
        }
    }

    @Override
    public void save(TransactionDTO transactionDTO)
    {
        entityManager.persist(transactionDTO);
    }
}
