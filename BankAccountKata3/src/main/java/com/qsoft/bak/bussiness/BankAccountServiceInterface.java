package com.qsoft.bak.bussiness;

import com.qsoft.bak.persistence.model.BankAccountDTO;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/4/13
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public interface BankAccountServiceInterface
{
    public void find(String accountNumber);
    public void creat(String accountNumber);
    public void update(BankAccountDTO bankAccountDTO);
    public void delete(BankAccountDTO bankAccountDTO);
    public void delete(String accountNumber);
}
