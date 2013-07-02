package com.qsoft.bak.persistence.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/2/13
 * Time: 1:37 PM
 * To change this template use File | Settings | File Templates.
 */

@Entity
@Table(name = "account")
@SequenceGenerator(name = "id_seq", sequenceName = "id_seq", allocationSize = 1)
public class BankAccountDTO
{

    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "id_seq")
    @Id
    @Column(name = "id")
    private int id;

    @Column(name = "accountNumber")
    private String accountNumber;

    @Column(name = "balance")
    private long balance;

    @Column(name = "openTimeStamp")
    private Date openTimeStamp;

    public BankAccountDTO()
    {
    }

    public BankAccountDTO(String accountNumber, long balance, Date openTimeStamp)
    {
        this.accountNumber = accountNumber;
        this.balance = balance;
        this.openTimeStamp = openTimeStamp;
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

