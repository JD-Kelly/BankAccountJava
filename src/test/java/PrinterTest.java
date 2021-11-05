import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.time.LocalDate;

public class PrinterTest {
    Statement statement = new Statement();

    @Test
    void testPrintsStatement() {
        statement.recordTransaction(100, LocalDate.of(2021, 1, 12));
        statement.recordTransaction(-50, LocalDate.of(2021, 1, 12));
        assertEquals("date || credit || debit || balance\n" + "12/01/2021 || 100.00 || - || 100.00\n"
                + "12/01/2021 || - || 50.00 || 50.00\n", Printer.print(statement));
    }
}
