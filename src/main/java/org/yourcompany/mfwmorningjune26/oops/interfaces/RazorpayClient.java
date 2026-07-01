package org.yourcompany.mfwmorningjune26.oops.interfaces;
public class RazorpayClient implements PaymentProvider, PaymentProvider2 {

    @Override
    public void pay(double amount) {
        System.out.println("Paying to driver.....");
    }
    
}
