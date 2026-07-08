package org.yourcompany.mfwmorningjune26.multithreading.addersubractor;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Lock lock = new ReentrantLock(); // P p = new Child();
        Adder adder = new Adder(count, lock);
        Subractor subractor = new Subractor(count, lock);

        Thread t1 = new Thread(adder);
        t1.start();
        Thread t2 = new Thread(subractor);
        t2.start();
        // t1 wait.
        t1.join(); // blocking call here
        // t2 waitl
        t2.join();
        System.out.println("Output: " + count.value);
    }
}
