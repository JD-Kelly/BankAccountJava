import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class AccountTest {

    @Test
    public void testBalance () {
        Account account = new Account();
        Integer result = account.getBalance();
        assertEquals(0, result);
    }
}
