package org.yourcompany.mfwmorningjune26.multithreading.addersubractorsync;


public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();
        Adder adder = new Adder(count);
        Subractor subractor = new Subractor(count);

        Thread t1 = new Thread(adder);
        t1.start();
        Thread t2 = new Thread(subractor);
        t2.start();
        // t1 wait.
        t1.join(); // blocking call here
        // t2 waitl
        t2.join();
        System.out.println("Output from sync flow: " + count.value);
    }

}
