package org.yourcompany.mfwmorningjune26.multithreading.helloworld;

public class HelloWorldPrinterTask implements Runnable {

    @Override
    public void run() {
        System.out.println("Hello World! " + 
            Thread.currentThread().getName()
        );
    }
    
}
