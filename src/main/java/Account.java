public class Account {
    private float balance;

    public Account() {
        this.balance = 0;
    }

    public float getBalance() {
        return balance;
    }

    public void deposit(float amount) {
        balance += amount;
    }

    public void withdraw(float amount) {
        if (amount > this.balance) {
            throw new ArithmeticException("Insufficient funds. Balance is: " + this.balance);
        } else {
            balance -= amount;
        }
    }
}
