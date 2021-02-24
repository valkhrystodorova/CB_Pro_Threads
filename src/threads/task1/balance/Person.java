package threads.task1.balance;

public class Person {
    private final Account account;

    public Person(Account account) {
        this.account = account;
    }

    public void withdraw(int amount) {
        account.withdraw(amount);
    }

    public void add(int amount) {
        account.add(amount);
    }
}
