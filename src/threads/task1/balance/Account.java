package threads.task1.balance;

public class Account {

    private Integer balance;

    public Account(int balance) {
        this.balance = balance;
    }

    public synchronized void withdraw(int amount) {
        System.out.println("Withdraw balance for " + amount);
        synchronized (this) {
            balance -= amount;
        }
    }

    public void add(int amount) {
        System.out.println("Add balance for " + amount);
        synchronized (this) {
            balance += amount;
        }
    }

    public void providePin() {

    }

    public int getBalance() {
        return balance;
    }
}
