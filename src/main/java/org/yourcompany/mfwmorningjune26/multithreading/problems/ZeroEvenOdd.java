package org.yourcompany.mfwmorningjune26.multithreading.problems;

import java.util.concurrent.Semaphore;

class ZeroEvenOdd {
    private int n;

    private Semaphore zero = new Semaphore(1);
    private Semaphore odd = new Semaphore(0);
    private Semaphore even = new Semaphore(0);

    public ZeroEvenOdd(int n) {
        this.n = n;
    }

    public void zero() throws InterruptedException {
        for (int i = 1; i <= n; i++) {
            zero.acquire();

            System.out.print(0 + " ");

            if (i % 2 == 0) {
                even.release();
            } else {
                odd.release();
            }
        }
    }

    public void odd() throws InterruptedException {
        for (int i = 1; i <= n; i += 2) {
            odd.acquire();

            System.out.print(i + " ");

            zero.release();
        }
    }

    public void even() throws InterruptedException {
        for (int i = 2; i <= n; i += 2) {
            even.acquire();

            System.out.print(i + " ");

            zero.release();
        }
    }
}
