package org.yourcompany.mfwmorningjune26.multithreading.addersubractor;

import java.util.concurrent.locks.Lock;

public class Subractor implements Runnable {
    private Count count;
    Lock lock;
    
    public Subractor(Count count, Lock lock) {
        this.count = count;
        this.lock = lock;
    }


    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("hello");
        }

        lock.lock(); // lock.
        System.out.println("Adder taking lock.");
        for(int i=1;i<=100000;i++){
            count.value -= 1;
        }
        lock.unlock(); // releasing lock.
        System.out.println("Adder released lock.");
    }
    
}
