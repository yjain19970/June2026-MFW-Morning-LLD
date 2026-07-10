package org.yourcompany.mfwmorningjune26.multithreading.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ConsumerTask implements Runnable {
    private Queue<Object> queue; // shared variable
    private int maxSize; // size of the queye.
    private String threadName; // thread name
    private Semaphore pSemaphore;
    private Semaphore cSemaphore;
    

    public ConsumerTask(Queue<Object> queue, int maxSize, String threadName,
        Semaphore pSemaphore, Semaphore cSemaphore
    ) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.threadName = threadName;
        this.pSemaphore = pSemaphore;
        this.cSemaphore = cSemaphore;
    }


    @Override // Consumer
    public void run() {
        while(true){ 
            //S1. 
            try {
                cSemaphore.acquire();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //S2.
            if(queue.size()>0){
                System.out.println("Name of the task:" + threadName + 
                " before remove form the queue, size"+ queue.size());
                queue.remove();
            }
            //S3.
            pSemaphore.release();
        }
    }
}