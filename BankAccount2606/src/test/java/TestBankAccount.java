import org.junit.Before;
import org.junit.Test;
import org.mockito.ArgumentCaptor;

import java.util.Date;

import static com.sun.org.apache.xalan.internal.lib.ExsltDatetime.time;
import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/26/13
 * Time: 1:36 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestBankAccount
{
    BankAccountDao mockBankAccountDao = mock(BankAccountDao.class);
    public static final String accountNumber = "0123456789";
    @Before
    public void setUp(){
        reset(mockBankAccountDao);
        BankAccount.bankAccountDao = mockBankAccountDao;
    }

    @Test
    public void testCreateNewAccount(){
        BankAccountDTO bankAccountDTO = new BankAccountDTO(accountNumber);
        BankAccount.openAccount(accountNumber);

        ArgumentCaptor<BankAccountDTO> argumentCaptor = ArgumentCaptor.forClass(BankAccountDTO.class);
        verify(mockBankAccountDao, times(1)).save(argumentCaptor.capture());

        assertEquals(argumentCaptor.getValue().getAccountNumber(), bankAccountDTO.getAccountNumber());
        assertEquals(argumentCaptor.getValue().getBalance(), 0, 0.000001);
    }

    @Test
    public void testGetAccount()
    {
        BankAccountDTO bankAccountDTO = new BankAccountDTO(accountNumber);

        when(mockBankAccountDao.getAccount(accountNumber)).thenReturn(bankAccountDTO);
        BankAccountDTO selectAccount = BankAccount.getAccount(accountNumber);

        assertEquals(bankAccountDTO, selectAccount);
    }
}
