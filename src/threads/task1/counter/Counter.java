package threads.task1.counter;

public class Counter {
    int counter;

    public void incrementCounter() {
        for (int i = 0; i < 10; i++) {
            counter++;
            System.out.println(counter);
        }
    }

//    public int getCounter() {
//        return counter;
//    }
}
