package com.qsoft.bak.persistence.dao;

import com.qsoft.bak.persistence.model.TransactionDTO;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/3/13
 * Time: 1:38 PM
 * To change this template use File | Settings | File Templates.
 */
public interface TransactionDAOInterface
{
    public void changeBalance(String accountNumber, long amount, String desciption);
    public void save(TransactionDTO transactionDTO);
}
