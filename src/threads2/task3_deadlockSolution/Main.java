package threads2.task3_deadlockSolution;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Person person1 = new Person("Bill", "0959595");
        Person person2 = new Person("John", "0505050");

        Thread thread1 = new Thread(() -> person1.dialNumber(person2));
        Thread thread2 = new Thread(() -> person2.dialNumber(person1));

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();
    }
}
