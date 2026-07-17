package org.yourcompany.mfwmorningjune26.javaadvconcepts;

import java.util.concurrent.Callable;

public class LambdaExample {
    public static void main(String[] args) throws Exception {
        //Way-1:
        SampleClassRunnableImpl r1 = new SampleClassRunnableImpl();
        r1.run();

        // Way-2: anonymous classes
        Runnable r2 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello from anonymous class!");
            }
        };
        r2.run();


        // Way-3: using lambdas
        SampleClassRunnableImpl r3 = new SampleClassRunnableImpl();
        Thread t1 = new Thread(r3);
        t1.start();

        // better way is to use lambda,
        new Thread(() -> System.out.println("hello from runnable, " 
        +Thread.currentThread().getName()))
        .start();

        Callable<Integer> c1 = () -> 3+3;
        c1.call();


    }
}
