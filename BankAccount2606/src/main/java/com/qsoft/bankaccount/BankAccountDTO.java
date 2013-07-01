package com.qsoft.bankaccount;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/26/13
 * Time: 1:43 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountDTO
{
    private String accountNumber;
    private long balance;
    private Date openTimeStamp;

    public BankAccountDTO()
    {
    }

    public BankAccountDTO(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public long getBalance()
    {
        return balance;
    }

    public void setBalance(long balance)
    {
        this.balance = balance;
    }

    public Date getOpenTimeStamp()
    {
        return openTimeStamp;
    }

    public void setOpenTimeStamp(Date openTimeStamp)
    {
        this.openTimeStamp = openTimeStamp;
    }
}
