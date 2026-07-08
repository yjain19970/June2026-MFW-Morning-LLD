package org.yourcompany.mfwmorningjune26.multithreading.addersubractorsync;

public class Adder implements Runnable {
    private Count count;

    public Adder(Count count) {
        this.count = count;
    }

    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("bye");
        }

        synchronized(count){
            System.out.println("lock taken by Adder");
            for (int i = 1; i <= 100000; i++) {
                count.value += 1;
            }
        }
        System.out.println("lock released by Adder");
    }
}
