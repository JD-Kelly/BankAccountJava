import org.junit.jupiter.api.Test;
import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertNotNull;


public class StatementTest {
    Statement statement = new Statement();

    @Test
    void testRecordTransactionSendsTransactionToLog() {
        statement.recordTransaction(50, LocalDate.of(2021,1, 12), 50);
        assertNotNull(statement.getLogEntry(0));
    }
}
