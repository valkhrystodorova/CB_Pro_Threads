package threads.task1.balance;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Account account = new Account(100000000);
        final Person person1 = new Person(account);
        final Person person2 = new Person(account);

        Thread thread1 = new Thread(() -> addToAccount(person1));
        Thread thread2 = new Thread(() -> withdrawFromAccount(person2));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Total balance = " + account.getBalance());
    }

    public static void addToAccount(Person person) {
        for (int i = 0; i < 1000; i++) {
            person.add(100);
        }
    }

    public static void withdrawFromAccount(Person person) {
        for (int i = 0; i < 1000; i++) {
            person.withdraw(100);
        }
    }

}
