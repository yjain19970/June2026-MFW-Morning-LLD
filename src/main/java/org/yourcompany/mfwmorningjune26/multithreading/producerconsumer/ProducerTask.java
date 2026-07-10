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
            synchronized(queue){ // lock
                if(queue.size() < maxSize){ /// [1 2 3 4 5 _]
                    System.out.println("Name of the task:" + threadName +
                    " before adding to the queue, size"+ queue.size());
                    
                    queue.add(new Object());
                } // unlock
            }
        }
    }
    
}
