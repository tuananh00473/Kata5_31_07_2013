package com.qsoft.bak;

import com.qsoft.bak.persistence.dao.impl.BankAccountDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.ui.control.BankAccount;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static junit.framework.Assert.assertNotNull;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/2/13
 * Time: 2:05 PM
 * To change this template use File | Settings | File Templates.
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:spring-config.xml")
public class BankAccountTest
{



    @Test
    public void testOpenNewAccount(){
        BankAccount.openNewAccount(accountNumber);
        BankAccountDTO account = BankAccountDAO.getAccount(accountNumber);

        assertNotNull(account);
    }


}
