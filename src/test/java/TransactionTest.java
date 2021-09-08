import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TransactionTest {
    LocalDate date = LocalDate.of(2021, 01, 12);
    Transaction transaction = new Transaction(50, 150, date);

    @Test
    void testStoresTransactionAmount () {
        assertEquals(50, transaction.getTransaction());
    }
    @Test
    void testStoresBalanceAtTimeOfTransaction () {
        assertEquals(150, transaction.getBalance());
    }
    @Test
    void testStoresDateAtTimeOfTransaction () {
        assertEquals(date, transaction.getDate());
    }
}