package com.xammax.task;

import java.util.concurrent.Semaphore;

public class H2O {

    private Semaphore semaphore1 = new Semaphore(-1);
    private Semaphore semaphore2 = new Semaphore(2);

    public H2O() {

    }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        semaphore2.acquire();
        // releaseHydrogen.run() outputs "H". Do not change or remove this line.
        releaseHydrogen.run();
        semaphore1.release();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        semaphore1.acquire();
        // releaseOxygen.run() outputs "O". Do not change or remove this line.
        releaseOxygen.run();
        semaphore2.release();
        semaphore2.release();
    }
}
