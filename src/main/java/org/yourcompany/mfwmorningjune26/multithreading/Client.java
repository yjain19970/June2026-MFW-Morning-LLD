package org.yourcompany.mfwmorningjune26.multithreading;

import org.yourcompany.mfwmorningjune26.multithreading.numberprinter.NumberPrinterTask;

public class Client {
    public static void main(String[] args) {
        System.out.println("main func, thread name: " + 
            Thread.currentThread().getName()
        );

        // HelloWorldPrinterTask task = new HelloWorldPrinterTask();
        // Thread t1 = new Thread(task);
        // t1.start();


        for(int i=1;i<=15;i++){
            NumberPrinterTask npt = new NumberPrinterTask(i);
            Thread t2 = new Thread(npt);
            t2.start();
        }
        
        
    }
}
/*

print numbers from 1-10 each using a new thread.
*/