import com.qsoft.transaction.BankTransaction;
import com.qsoft.transaction.TransactionDTO;
import com.qsoft.transaction.TransactionDao;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.reset;
import static org.mockito.Mockito.when;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/28/13
 * Time: 1:46 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestTransaction
{
    private static final String DEPOSITE = "deposite";
    private static final String WITHDRAW = "withdraw";
    TransactionDao mocTransaction = mock(TransactionDao.class);
    private static final String accountNumber = "0123456789";
    private static long amount = 1000000;


    @Before
    public void setUp()
    {
        reset(mocTransaction);
        mocTransaction = BankTransaction.transactionDao;
    }

    @Test
    public void testDeposite()
    {
        TransactionDTO transactionDTO = new TransactionDTO(accountNumber, amount, DEPOSITE);
        when(mocTransaction.saveTransaction(transactionDTO)).thenReturn(transactionDTO);

        TransactionDTO transactionDTOSaved = mocTransaction.saveTransaction(transactionDTO);

        assertEquals(transactionDTO, transactionDTOSaved);
    }

    @Test
    public void testWithdraw()
    {
        TransactionDTO transactionDTO = new TransactionDTO(accountNumber, amount, WITHDRAW);
    }
}
