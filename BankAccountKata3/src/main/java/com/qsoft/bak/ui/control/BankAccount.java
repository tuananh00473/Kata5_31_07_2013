package com.qsoft.bak.ui.control;

import com.qsoft.bak.persistence.dao.impl.BankAccountDAO;
import com.qsoft.bak.persistence.dao.impl.TransactionDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;

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


    public static void openNewAccount(String accountNumber)
    {

        bankAccountDAO.openNewAccount(accountNumber);
    }

    public static BankAccountDTO getAccount(String accountNumber)
    {
        return null;
    }
}
