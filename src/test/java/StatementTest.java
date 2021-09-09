import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StatementTest {
    Statement statement = new Statement();

    @Test
    void testRecordTransactionSendsTransactionToLog() {
        statement.recordTransaction(50, LocalDate.of(2021,1, 12));
        assertNotNull(statement.getLogEntry(0));
    }
    @Test
    void testRecordTransactionSendsMultipleTransactionsToLog() {
        statement.recordTransaction(50, LocalDate.of(2021,1, 12));
        statement.recordTransaction(50, LocalDate.of(2021,1, 12));
        statement.recordTransaction(50, LocalDate.of(2021,1, 12));
        assertNotNull(statement.getLogEntry(2));
    }
    @Test
    void testRecordTransactionAndSumsCurrentBalance() {
        statement.recordTransaction(50, LocalDate.of(2021, 1, 12));
        statement.recordTransaction(50, LocalDate.of(2021, 1, 12));
        statement.recordTransaction(-50, LocalDate.of(2021, 1, 12));
        assertEquals(50, statement.currentBalance());
    }
}
