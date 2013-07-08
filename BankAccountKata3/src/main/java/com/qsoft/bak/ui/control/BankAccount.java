package com.qsoft.bak.ui.control;

import com.qsoft.bak.persistence.dao.impl.BankAccountDAO;
import com.qsoft.bak.persistence.dao.impl.TransactionDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/2/13
 * Time: 2:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount
{
    private static BankAccountDAO bankAccountDAO;
    private TransactionDAO transactionDAO;


    public static BankAccountDTO openNewAccount(String accountNumber)
    {
        return bankAccountDAO.openNewAccount(accountNumber);
    }

    public static BankAccountDTO getAccount(String accountNumber)
    {
        return null;
    }
}
