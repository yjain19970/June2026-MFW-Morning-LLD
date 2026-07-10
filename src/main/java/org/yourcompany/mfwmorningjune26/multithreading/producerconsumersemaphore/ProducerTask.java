package org.yourcompany.mfwmorningjune26.multithreading.producerconsumersemaphore;

import java.util.Queue;
import java.util.concurrent.Semaphore;

public class ProducerTask implements Runnable {
    private Queue<Object> queue;
    private int maxSize;
    private String threadName;
    private Semaphore pSemaphore;
    private Semaphore cSemaphore;

    
    public ProducerTask(Queue<Object> queue, int maxSize, String threadName,
        Semaphore pSemaphore, Semaphore cSemaphore
    ) {
        this.queue = queue;
        this.maxSize = maxSize;
        this.threadName = threadName;
        this.pSemaphore = pSemaphore;
        this.cSemaphore = cSemaphore;
    }


    @Override
    public void run() {
        while(true){
            //S1.
            try {
                pSemaphore.acquire();
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
            //S2.
            if(queue.size() < maxSize){ /// [1 2 3 4 5 _]
                System.out.println("Name of the task:" + threadName +
                " before adding to the queue, size"+ queue.size());
                queue.add(new Object());
            } // unlock
            //S3.
            cSemaphore.release();
        }
    }
    
}
