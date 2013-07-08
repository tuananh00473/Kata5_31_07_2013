package com.qsoft.bak.persistence.dao;

import com.qsoft.bak.persistence.model.BankAccountDTO;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/2/13
 * Time: 2:04 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BankAccountDAOInterface
{
    public BankAccountDTO openNewAccount(String accountNumber);
    public BankAccountDTO getAccount(String accountNumber);
    public List<BankAccountDTO> getListAllAccount();
    public void save(BankAccountDTO account);
}
