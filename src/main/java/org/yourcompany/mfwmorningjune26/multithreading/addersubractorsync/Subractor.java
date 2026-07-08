package org.yourcompany.mfwmorningjune26.multithreading.addersubractorsync;

public class Subractor implements Runnable {
    private Count count;
    
    public Subractor(Count count) {
        this.count = count;
    }


    
    @Override
    public void run() {
        for(int i=0;i<3;i++){
            System.out.println("hello");
        }

        synchronized(count){
            System.out.println("lock taken by Subractor");
            for (int i = 1; i <= 100000; i++) {
                count.value -= 1;
            }
        }
        System.out.println("lock released by Subractor");
    }
    
}

