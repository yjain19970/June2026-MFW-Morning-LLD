package org.yourcompany.mfwmorningjune26.inventorymanagementsystem;

public class Order implements Comparable<Order> {
    private String orderId;
    private boolean isExpress; // true: order is express, false otherwise
    

    public Order(String orderId, boolean isExpress) {
        this.orderId = orderId;
        this.isExpress = isExpress;
    }






    public String getOrderId() {
        return orderId;
    }
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }
    public boolean isExpress() {
        return isExpress;
    }
    public void setExpress(boolean isExpress) {
        this.isExpress = isExpress;
    }






    @Override
    public int compareTo(Order o) {
        /**
         * here I should write my sorting logic
         */
        if(this.isExpress == o.isExpress){
            // tie. Decide by orderId
            return this.orderId.compareTo(o.orderId);
        }
        else if(this.isExpress){
            return -1;
        }else{
            return 1;
        }
    }
    
}
