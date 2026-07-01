package org.yourcompany.mfwmorningjune26.oops.interfaces;

public class TripService {
    // paying.
    private PaymentProvider paymentProvider;

    public TripService(PaymentProvider paymentProvider) {
        this.paymentProvider = paymentProvider;
    }






    public void processPayment(double amount){
        paymentProvider.pay(amount);
    }

}
