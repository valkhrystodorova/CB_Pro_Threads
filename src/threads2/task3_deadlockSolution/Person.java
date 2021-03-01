package threads2.task3_deadlockSolution;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Person {
    final private String name;
    final private String number;
    Lock lock = new ReentrantLock();

    public Person(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public Lock getLock() {
        return lock;
    }

    public void dialNumber(Person person) {
        System.out.println(this.name + "Calling " + person.getNumber());
        try {
            if (this.getLock().tryLock(10, TimeUnit.SECONDS)) {
                try {
                    Thread.sleep(1000);
                    if (person.getLock().tryLock(10, TimeUnit.SECONDS)) {
                        try {
                            person.answer(this);
                        } finally {
                            person.getLock().unlock();
                        }
                    } else {
                        System.out.println("The subscriber " + person.getNumber() + " is busy at the moment");
                    }
                } finally {
                    this.getLock().unlock();
                }
            }

        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private void answer(Person person) {
        System.out.println(this.name + " has answered to " + person.name);
    }
}
