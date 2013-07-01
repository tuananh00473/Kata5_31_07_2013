package com.qsoft.bankaccount;

import com.qsoft.bankaccount.BankAccountDTO;
import com.qsoft.bankaccount.BankAccountDao;
import com.qsoft.transaction.TransactionDTO;
import com.qsoft.transaction.TransactionDao;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/26/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount
{
    public static BankAccountDao bankAccountDao;
    public static TransactionDao transactionDao;

    public static BankAccountDTO openAccount(String accountNumber)
    {
        BankAccountDTO bankAccountDTO = new BankAccountDTO(accountNumber);
        bankAccountDao.save(bankAccountDTO);
        return bankAccountDTO;
    }

    public static BankAccountDTO getAccount(String accountNumber)
    {
        BankAccountDTO bankAccountDTO = bankAccountDao.getAccount(accountNumber);
        return bankAccountDTO;
    }

    public void Deposit(String accountNumber, long amount, String description){
        BankAccountDTO bankAccountDTO = bankAccountDao.getAccount(accountNumber);
        bankAccountDTO.setBalance(bankAccountDTO.getBalance() + amount);

        TransactionDTO transactionDTO = new TransactionDTO(bankAccountDTO.getAccountNumber(),amount, description);
        transactionDao.saveTransaction(transactionDTO);
    }

    public void Withdraw(String accountNumber, long amount, String description){
        BankAccountDTO bankAccountDTO = bankAccountDao.getAccount(accountNumber);
        bankAccountDTO.setBalance(bankAccountDTO.getBalance() - amount);

        TransactionDTO transactionDTO = new TransactionDTO(bankAccountDTO.getAccountNumber(),amount, description);
        transactionDao.saveTransaction(transactionDTO);
    }


}
