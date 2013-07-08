package com.qsoft.bak.persistence.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/3/13
 * Time: 1:44 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "transaction")
@SequenceGenerator(name = "id_trans_seq", sequenceName = "id_trans_seq", allocationSize = 1)
public class TransactionDTO
{
    @Id
    @GeneratedValue
    @Column(name = "id")
    private int id;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "amount")
    private long amount;

    @Column(name = "balanceRemaining")
    private long balanceRemaining;

    @Column(name = "description")
    private String description;

    @Column(name = "timeTransaction")
    private Date timeTransaction;

    public TransactionDTO()
    {
    }

    public TransactionDTO(String accountNumber, long amount, long balanceRemaining, String description)
    {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.balanceRemaining = balanceRemaining;
        this.description = description;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getAccountNumber()
    {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public long getAmount()
    {
        return amount;
    }

    public void setAmount(long amount)
    {
        this.amount = amount;
    }

    public long getbalanceRemaining()
    {
        return balanceRemaining;
    }

    public void setbalanceRemaining(long balanceRemaining)
    {
        this.balanceRemaining = balanceRemaining;
    }

    public String getdescription()
    {
        return description;
    }

    public void setdescription(String description)
    {
        this.description = description;
    }

    public long getBalanceRemaining()
    {
        return balanceRemaining;
    }

    public void setBalanceRemaining(long balanceRemaining)
    {
        this.balanceRemaining = balanceRemaining;
    }

    public String getDescription()
    {
        return description;
    }

    public void setDescription(String description)
    {
        this.description = description;
    }

    public Date getTimeTransaction()
    {
        return timeTransaction;
    }

    public void setTimeTransaction(Date timeTransaction)
    {
        this.timeTransaction = timeTransaction;
    }
}
