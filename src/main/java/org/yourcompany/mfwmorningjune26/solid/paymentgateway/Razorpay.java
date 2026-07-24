package org.yourcompany.mfwmorningjune26.solid.paymentgateway;

public class Razorpay implements PaymentInterface {

    private RazorpayClient razorpayClient;
    
    

    public Razorpay(RazorpayClient razorpayClient) {
        this.razorpayClient = razorpayClient;
    }



    @Override
    public void makePayment() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'makePayment'");
    }
}
