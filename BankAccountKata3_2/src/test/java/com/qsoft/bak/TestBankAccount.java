package com.qsoft.bak;

import com.qsoft.bak.persistence.dao.impl.BankAccountDAOImpl;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/10/13
 * Time: 2:03 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"classpath:spring-config.xml"})
public class TestBankAccount
{

    @Autowired
    BankAccountDAOImpl bankAccountDAO;

    @Test
    public void testOpenNewAccount()
    {
        bankAccountDAO.create(new BankAccountDTO("account1", 0, new Date()));

    }
}
