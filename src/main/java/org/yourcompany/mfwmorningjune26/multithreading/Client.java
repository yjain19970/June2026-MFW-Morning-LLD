package org.yourcompany.mfwmorningjune26.multithreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import org.yourcompany.mfwmorningjune26.multithreading.numberprinter.NumberPrinterTask;

public class Client {
    public static void main(String[] args) {
        System.out.println("main func, thread name: " + 
            Thread.currentThread().getName()
        );

        // HelloWorldPrinterTask task = new HelloWorldPrinterTask();
        // Thread t1 = new Thread(task);
        // t1.start();

        ExecutorService executorService = Executors.newFixedThreadPool(10);

        for(int i=1;i<=15;i++){
            NumberPrinterTask npt = new NumberPrinterTask(i);
            executorService.submit(npt);
        }
        
        executorService.shutdown();
    }
}
/*

print numbers from 1-10 each using a new thread.
*/