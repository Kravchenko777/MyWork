package com.xammax.task;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.Semaphore;

public class Test1115 {
    private int n;

    private Semaphore semaphore1 = new Semaphore(1);
    private Semaphore semaphore2 = new Semaphore(1);

    public Test1115(int n) {
        this.n = n;
        try
        {
            semaphore2.acquire();
        }
        catch (InterruptedException ex) {}
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphore2.acquire();
            // printFoo.run() outputs "foo". Do not change or remove this line.
            printFoo.run();
            semaphore1.release();
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            semaphore1.acquire();
            // printBar.run() outputs "bar". Do not change or remove this line.
            printBar.run();
            semaphore2.release();
        }
    }
}
