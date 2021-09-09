import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;


public class AccountTest {
    Statement statement = new Statement();
    Account account = new Account(statement);

    @Test
    void testDeposit () {
        account.deposit(100,  LocalDate.of(2021,12, 1));
        float result = statement.currentBalance();
        assertEquals(100, result);
    }

    @Test
    void testWithdraw() {
        account.deposit(100, LocalDate.of(2021,12, 1));
        account.withdraw(50,  LocalDate.of(2021,12, 1));
        float result = statement.currentBalance();
        assertEquals(50, result);
    }

    @Test
    void testExceptionIsThrownIfWithdrawalTakesBalanceBelowZero() {
        account.deposit(100, LocalDate.of(2021,12,1));
        assertThrows(ArithmeticException.class, () -> account.withdraw(150,  LocalDate.of(2021,12,1)));
    }
}
