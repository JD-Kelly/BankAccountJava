import java.time.LocalDate;

public class Account {

    Statement statement;

    public Account(Statement injected) {
        statement = injected;
    }

    public void deposit(float amount, LocalDate Localdate) {
        this.statement.recordTransaction(amount, Localdate);
    }

    public void withdraw(float amount, LocalDate localDate) {
        if (amount > statement.currentBalance()) {
            throw new ArithmeticException("Insufficient funds. Balance is: " + statement.currentBalance());
        } else {
            this.statement.recordTransaction(-amount, localDate);
        }
    }
}
