package threads2.task2_deadlock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Person {
    final private String number;
    final private String name;
    Lock lock1 = new ReentrantLock();
    public Person (String name, String number){
        this.number = number;
        this.name = name;
    }
    public String getNumber(){
        return number;
    }

//    public synchronized void dialNumber (Person person){
//        System.out.println(this.name + "Calling " + person.getNumber());
//        person.answer(this);
//    }
//
//    public synchronized void answer (Person person){
//        System.out.println(this.name + " has answered to " + person.name);
//    }

    public void dialNumber (Person person){
        lock1.lock();
        try {
            System.out.println(this.name + "Calling " + person.getNumber());
            person.answer(this);
        }finally {
            lock1.unlock();
        }
    }
    public void answer (Person person){
        lock1.lock();
        try {
            System.out.println(this.name + " has answered to " + person.name);
        }finally {
            lock1.unlock();
        }
    }
}
