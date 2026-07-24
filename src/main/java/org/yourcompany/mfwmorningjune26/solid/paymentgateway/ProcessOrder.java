package org.yourcompany.mfwmorningjune26.solid.paymentgateway;

public class ProcessOrder {
    
    public PaymentInterface payment;
    

    public ProcessOrder(PaymentInterface payment) {
        this.payment = payment;
    }


    /**
     * Dependency Injection.
     * 
     */
    

    public void process(){
        payment.makePayment();
    }
}
