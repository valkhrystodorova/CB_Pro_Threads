package threads.task1.join;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() -> System.out.println("Thread 1 finished"));
        Thread thread2 = new Thread(() -> System.out.println("Thread 2 finished"));

        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println("Main thread finished");






    }
}
