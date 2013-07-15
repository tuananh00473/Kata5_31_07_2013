package com.qsoft.bak.persistence.dao.impl;

import com.qsoft.bak.persistence.dao.TransactionDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.persistence.model.GenericDataModel;
import com.qsoft.bak.persistence.model.TransactionDTO;

import javax.persistence.Query;
import java.util.Date;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/12/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDAOImpl extends GenericDAOImpl implements TransactionDAO
{
    public static final long MINIMUM_BALANCE = 50000;
    public static final long VALUE_AROUND = 25000;

    @Override
    public GenericDataModel find(long id)
    {
        return entityManager.find(TransactionDTO.class, id);
    }

    @Override
    public GenericDataModel find(String accountNumber)
    {
        return entityManager.find(TransactionDTO.class, accountNumber);
    }

    @Override
    public List<GenericDataModel> getAll()
    {
        Query query = entityManager.createQuery("select td from TransactionDTO td");
        return query.getResultList();
    }

    @Override
    public TransactionDTO changeBalance(String accountNumber, long amount, String description)
    {
        BankAccountDTO bankAccountDTO = (BankAccountDTO) find(accountNumber);
        if(bankAccountDTO.getBalance() + amount >= MINIMUM_BALANCE && amount % VALUE_AROUND == 0){
            bankAccountDTO.setBalance(bankAccountDTO.getBalance() + amount);
            update(bankAccountDTO);
            TransactionDTO transactionDTO = new TransactionDTO(accountNumber, amount, bankAccountDTO.getBalance() + amount, new Date());
            return  transactionDTO;
        }
        return null;
    }

    public void saveToDB(TransactionDTO transactionDTO){
        create(transactionDTO);
    }
}
