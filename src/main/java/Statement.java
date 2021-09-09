import java.time.LocalDate;
import java.util.ArrayList;

public class Statement {
    public ArrayList<Transaction> log = new ArrayList<>();

    public void recordTransaction(float amount, LocalDate date) {
        Transaction transaction = new Transaction(amount, date, (currentBalance() + amount));
        this.log.add(transaction);
    }
    public Transaction getLogEntry(int index) {
        return this.log.get(index);
    }

    public float currentBalance() {
        float result = 0;
        for (Transaction transaction : this.log) {
            result += transaction.getTransaction();
        }
        return result;
    }
    public ArrayList<Transaction> getLog() { return this.log; }
}
