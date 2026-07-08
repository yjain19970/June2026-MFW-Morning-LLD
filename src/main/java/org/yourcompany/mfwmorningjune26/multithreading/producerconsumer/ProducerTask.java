package org.yourcompany.mfwmorningjune26.multithreading.producerconsumer;

import java.util.Queue;

public class ProducerTask implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String threadName;

    
    public ProducerTask(Queue<Object> queue, int maxSize, String threadName) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.threadName = threadName;
    }


    @Override
    public void run() {

        while(true){
            //.....
        }
    }
    
}
