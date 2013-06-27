/**
 * Created with IntelliJ IDEA.
 * User: anhnt
 * Date: 6/26/13
 * Time: 1:41 PM
 * To change this template use File | Settings | File Templates.
 */
public class BankAccount
{
    static BankAccountDao bankAccountDao;

    public static BankAccountDTO openAccount(String accountNumber)
    {
        BankAccountDTO bankAccountDTO = new BankAccountDTO(accountNumber);
        bankAccountDao.save(bankAccountDTO);
        return bankAccountDTO;
    }

    public static BankAccountDTO getAccount(String accountNumber)
    {
        BankAccountDTO bankAccountDTO = bankAccountDao.getAccount(accountNumber);
        return bankAccountDTO;
    }
}
