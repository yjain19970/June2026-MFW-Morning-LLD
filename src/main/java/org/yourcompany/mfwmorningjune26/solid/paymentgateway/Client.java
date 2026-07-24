package org.yourcompany.mfwmorningjune26.solid.paymentgateway;

public class Client {
    public static void main(String[] args) {
        RazorpayClient rzpClient = new RazorpayClient();
        Razorpay razorpay = new Razorpay(rzpClient);


        ProcessOrder processOrder = new ProcessOrder(razorpay);
        processOrder.process();
    }
}
