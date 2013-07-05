package com.qsoft.bak.bussiness;

import com.qsoft.bak.persistence.dao.impl.BankAccountDAO;
import com.qsoft.bak.persistence.dao.impl.TransactionDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 7/4/13
 * Time: 1:54 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccountService implements BankAccountServiceInterface
{
    @Autowired
    private BankAccountDAO bankAccountDAO;
    private TransactionDAO transactionDAO;
}
