import java.time.LocalDate;


public class Transaction {
    private float transaction;
    private float balance;
    private LocalDate date;

    public Transaction(float amountInit, float balanceInit, LocalDate dateInit) {
        transaction = amountInit;
        balance = balanceInit;
        date = dateInit;
    }
    public float getTransaction() {
        return this.transaction;
    }
    public float getBalance() {
        return this.balance;
    }
    public LocalDate getDate() {
        return this.date;
    }
}
