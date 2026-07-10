package org.yourcompany.mfwmorningjune26.multithreading.producerconsumer;

import java.util.Queue;

public class ConsumerTask implements Runnable {
    private Queue<Object> queue; // shared variable
    private int maxSize; // size of the queye.
    private String threadName; // thread name
    

    public ConsumerTask(Queue<Object> queue, int maxSize, String threadName) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.threadName = threadName;
    }


    @Override
    public void run() {
        while(true){
            synchronized(queue){
                if(queue.size()>0){
                    System.out.println("Name of the task:" + threadName + 
                    " before remove form the queue, size"+ queue.size());
                    
                    queue.remove();
                }
        }
        }
    }
}