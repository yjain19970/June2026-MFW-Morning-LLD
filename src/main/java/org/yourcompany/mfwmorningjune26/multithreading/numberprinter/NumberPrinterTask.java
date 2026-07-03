package org.yourcompany.mfwmorningjune26.multithreading.numberprinter;

public class NumberPrinterTask implements  Runnable {
    private int number;
    

    public NumberPrinterTask(int number) {
        this.number = number;
    }


    @Override
    public void run() {
        System.out.println("number is: " + number + " thread is: "+
                Thread.currentThread().getName()
            );
    }
    
}
