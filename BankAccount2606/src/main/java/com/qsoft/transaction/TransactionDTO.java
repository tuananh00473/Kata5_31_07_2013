package com.qsoft.transaction;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/28/13
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class TransactionDTO
{
    private String accountNumber;
    private long amount;
    private String description;

    public TransactionDTO(String accountNumber, long amount, String description)
    {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public long getAmount()
    {
        return amount;
    }

    public void setAmount(long amount)
    {
        this.amount = amount;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }
}
