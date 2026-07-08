package org.yourcompany.mfwmorningjune26.multithreading.addersubractor;

import java.util.concurrent.locks.Lock;

public class Adder implements Runnable {
    private Count count;
    private Lock lock;

    public Adder(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("bye");
        }

        lock.lock();
        System.out.println("lock taken by Adder");
        for (int i = 1; i <= 100000; i++) {
            count.value += 1;
        }
        lock.unlock();
        System.out.println("lock released by Adder");
    }
}