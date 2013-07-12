package com.qsoft.bak.persistence.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/10/13
 * Time: 2:02 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "transaction")
@SequenceGenerator(name = "id_transaction_seq" , sequenceName = "id_transaction_seq" , allocationSize = 1)
public class TransactionDTO extends GenericDataModel
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_transaction_seq")
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "amount")
    private long amount;

    @Column(name = "remainBalance")
    private long remainBalance;

    @Column(name = "transactionTime")
    private Date transactionTime;

    public TransactionDTO()
    {
    }

    public TransactionDTO(String accountNumber, long amount, long remainBalance, Date transactionTime)
    {
        this.accountNumber = accountNumber;
        this.amount = amount;
        this.remainBalance = remainBalance;
        this.transactionTime = transactionTime;
    }

    public long getId()
    {
        return id;
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

    public long getRemainBalance()
    {
        return remainBalance;
    }

    public void setRemainBalance(long remainBalance)
    {
        this.remainBalance = remainBalance;
    }

    public Date getTransactionTime()
    {
        return transactionTime;
    }

    public void setTransactionTime(Date transactionTime)
    {
        this.transactionTime = transactionTime;
    }
}
