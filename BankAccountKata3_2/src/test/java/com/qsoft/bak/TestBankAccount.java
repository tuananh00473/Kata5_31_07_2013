package com.qsoft.bak;

import com.qsoft.bak.persistence.dao.impl.BankAccountDAOImpl;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/10/13
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBankAccount
{

    @Autowired
    BankAccountDAOImpl bankAccountDAO;

    @Test
    public void testOpenNewAccount()
    {
        bankAccountDAO.openNewAccount(new BankAccountDTO("account1", 0, new Date()));
    }
}
