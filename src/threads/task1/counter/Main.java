package threads.task1.counter;

public class Main {


    public static void main(String[] args) throws InterruptedException {

      Counter counter = new Counter();
        Thread thread1 = new Thread(() -> counter.incrementCounter());
        thread1.start();
        thread1.join();


        Thread thread2 = new Thread(() -> counter.incrementCounter());
        thread2.start();
        thread2.join();


        Thread thread3 = new Thread(() -> counter.incrementCounter());
        thread3.start();
        thread3.join();

    }

//   
}


