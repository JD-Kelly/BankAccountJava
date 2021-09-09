import java.time.LocalDate;
import java.util.ArrayList;

public class Statement {
    public ArrayList<Transaction> log = new ArrayList<>();

    public void recordTransaction(float amount, LocalDate date, float balance) {
        Transaction transaction = new Transaction(amount, date, balance);
        this.log.add(transaction);
    }
    public Transaction getLogEntry(int index) {
        return this.log.get(index);
    }
    public ArrayList<Transaction> getLog() { return this.log; }
}
