package org.yourcompany.mfwmorningjune26.inventorymanagementsystem;

import java.util.PriorityQueue;
import java.util.Queue;

public class OrderProcessor {
    // responsible for setting my orders for delivery.

    private Queue<Order> queue;

    public OrderProcessor() {
        queue = new PriorityQueue<>();
        /**
         * 
         * comparator = (a,b) -> a.compareTo(b);
         * queue = new PriorityQueue<>(comparator)
         * 
         * 
         */
    }

    public void addOrder(Order order){
        queue.offer(order);
    }

    public Order processOrder(){
        return queue.poll(); // top most order.
    }

    public int getSize(){
        return queue.size();
    }
    
}
