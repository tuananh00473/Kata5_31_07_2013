package com.qsoft.bak.persistence.dao;

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
    public void save(String accountNumber, long balance, long amount, String desciption);
}
