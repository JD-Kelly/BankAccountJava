public class Account {
    private Integer balance;

    public Account() {
        this.balance = 0;
    }

    public Integer getBalance() {
        return balance;
    }

    public void deposit(int amount) {
        balance += amount;
    }

    public void withdraw(int amount) {
        balance -= amount;
    }
}
