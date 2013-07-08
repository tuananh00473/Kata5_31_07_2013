package com.qsoft.bak;

import com.qsoft.bak.persistence.dao.impl.BankAccountDAO;
import com.qsoft.bak.persistence.model.BankAccountDTO;
import com.qsoft.bak.ui.control.BankAccount;
import org.dbunit.IDatabaseTester;
import org.dbunit.JdbcDatabaseTester;
import org.dbunit.dataset.DataSetException;
import org.dbunit.dataset.IDataSet;
import org.dbunit.dataset.xml.FlatXmlDataSetBuilder;
import org.dbunit.operation.DatabaseOperation;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.postgresql.ds.PGPoolingDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.sql.DataSource;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;

import static junit.framework.Assert.assertEquals;
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
    @Autowired
    private BankAccountDAO bankAccountDAO;
    private Connection connection;

    private final static  String accountNumber = "1234567890";
    public static final String JDBC_DRIVER = org.postgresql.Driver.class.getName();
    public static final String JDBC_URL = "jdbc:postgresql://localhost:5432/bank_account";
    public static final String JDBC_SEVER_LOCATION = "localhost";
    public static final String JDBC_DATABASE = "bank_account";
    public static final String JDBC_USERNAME = "admin";
    public static final String JDBC_PASSWORD = "09020510";
    private static final String resourcePath = new File("").getAbsolutePath() + "/src/test/resources";
    private DataSource dataSource;

    @Before
    public void setUp() throws Exception
    {
        IDatabaseTester dbTest = new JdbcDatabaseTester(JDBC_DRIVER, JDBC_URL, JDBC_USERNAME, JDBC_PASSWORD);
        dbTest.setSetUpOperation(DatabaseOperation.CLEAN_INSERT);

        String dataFile = resourcePath + "/data.xml";
        IDataSet iDataSet = new FlatXmlDataSetBuilder().build(new FileInputStream(dataFile));

        dbTest.setDataSet(iDataSet);
        dbTest.onSetup();

        DataSource dataSource = getDataSource();
        connection = dataSource.getConnection();
    }

    public DataSource getDataSource()
    {
        PGPoolingDataSource dataSource = new PGPoolingDataSource();
        dataSource.setServerName(JDBC_SEVER_LOCATION);
        dataSource.setDatabaseName(JDBC_DATABASE);
        dataSource.setUser(JDBC_USERNAME);
        dataSource.setPassword(JDBC_PASSWORD);
        return dataSource;
    }


    @Test
    public void testOpenNewAccount(){
        BankAccountDTO accountDTO = BankAccount.openNewAccount(accountNumber);
        BankAccountDTO account = BankAccount.getAccount(accountNumber);
        assertNotNull(account);
        assertEquals(account, accountDTO);
    }

    @Test
    public void testDeposite(){

    }

    @Test
    public void testWithdraw(){

    }

}
