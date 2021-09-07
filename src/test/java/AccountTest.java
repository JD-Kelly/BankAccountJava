import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {

    @Test
    public void testBalance () {
        Account account = new Account();
        Integer result = account.getBalance();
        assertEquals(0, result);
    }

    @Test
    public void testDeposit () {
        Account account = new Account();
        account.deposit(100);
        Integer result = account.getBalance();
        assertEquals(100, result);
    }

    @Test
    public void testWithdraw() {
        Account account = new Account();
        account.deposit(100);
        account.withdraw(50);
        Integer result = account.getBalance();
        assertEquals(50, result);
    }
}
