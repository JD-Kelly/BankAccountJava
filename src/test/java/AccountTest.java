import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AccountTest {
    Account account = new Account();

    @Test
    void testBalance () {
        Integer result = account.getBalance();
        assertEquals(0, result);
    }

    @Test
    void testDeposit () {
        account.deposit(100);
        Integer result = account.getBalance();
        assertEquals(100, result);
    }

    @Test
    void testWithdraw() {
        account.deposit(100);
        account.withdraw(50);
        Integer result = account.getBalance();
        assertEquals(50, result);
    }

    @Test
    void testExceptionIsThrownIfWithdrawalTakesBalanceBelowZero() {
        account.deposit(100);
        assertThrows(ArithmeticException.class, () -> account.withdraw(150));
    }
}
