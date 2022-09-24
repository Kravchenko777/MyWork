package com.xammax.task;

import java.util.concurrent.Semaphore;
import java.util.function.IntConsumer;

public class Test1116 {
    private int n;

    private Semaphore semaphore1 = new Semaphore(2);
    private Semaphore semaphore2 = new Semaphore(2);
    private Semaphore semaphore3 = new Semaphore(2);

    public Test1116(int n) {
        this.n = n;
    }

    // printNumber.accept(x) outputs "x", where x is an integer.
    public void zero(IntConsumer printNumber) throws InterruptedException {
        printNumber.accept(0);
    }

    public void even(IntConsumer printNumber) throws InterruptedException {

    }

    public void odd(IntConsumer printNumber) throws InterruptedException {

    }
}
