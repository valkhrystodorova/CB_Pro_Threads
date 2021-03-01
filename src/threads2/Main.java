package threads2;

public class Main {
    public static void main(String[] args) {
        PriorityThread thread1 = new PriorityThread("thread1");
        PriorityThread thread2 = new PriorityThread("thread2");
        PriorityThread thread3 = new PriorityThread("thread3");
        thread1.setPriority(Thread.MIN_PRIORITY);
        thread2.setPriority(Thread.MAX_PRIORITY);
        thread3.setPriority(Thread.NORM_PRIORITY);

        thread1.start();
        thread2.start();
        thread3.start();
    }
}
