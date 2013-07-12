package com.qsoft.bak.persistence.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/10/13
 * Time: 2:01 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "bankaccount")
@SequenceGenerator(name = "id_bankaccount_seq" , sequenceName = "id_bankaccount_seq" , allocationSize = 1)
public class BankAccountDTO extends GenericDataModel
{
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_bankaccount_seq")
    @Id
    @Column(name = "id")
    private long id;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "balance")
    private long balance;

    @Column(name = "openStampTime")
    private Date openStampTime;

    public BankAccountDTO(String accountNumber, long balance, Date openStampTime)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openStampTime = openStampTime;
    }

    public BankAccountDTO()
    {
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

    public long getBalance()
    {
        return balance;
    }

    public void setBalance(long balance)
    {
        this.balance = balance;
    }

    public Date getOpenStampTime()
    {
        return openStampTime;
    }

    public void setOpenStampTime(Date openStampTime)
    {
        this.openStampTime = openStampTime;
    }
}
