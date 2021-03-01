package threads2.task2_deadlock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person person1 = new Person("Anna", "0999999999");
        Person person2 = new Person("Olha", "0666666666");

        Thread thread1 = new Thread(() -> person1.dialNumber(person2));
        Thread thread2 = new Thread(() -> person2.dialNumber(person1));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

    }
}
