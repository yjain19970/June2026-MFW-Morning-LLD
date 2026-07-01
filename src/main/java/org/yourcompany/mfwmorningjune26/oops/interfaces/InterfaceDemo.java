package org.yourcompany.mfwmorningjune26.oops.interfaces;

public class InterfaceDemo {
    public static void main(String[] args) {
        PaymentProvider payment = new RazorpayClient();
        payment.pay(10);

        PaymentProvider payment2 = new PaytmClient();
        payment2.pay(21);
        
        
    }
}
