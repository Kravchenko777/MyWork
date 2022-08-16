package com.xammax;

import org.junit.jupiter.api.Test;

import java.util.concurrent.*;
import java.util.concurrent.atomic.AtomicInteger;

public class MyTreadsTest {

    @Test
    void simpleTest() throws InterruptedException {

        AtomicInteger a= new AtomicInteger();
        Runnable runnable = ()->{

            for(int j=0;j<10000000;j++){
                a.incrementAndGet();
            }

            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("----- "+Thread.currentThread().getName()+" "+a);
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread3.start();
        thread2.start();
        thread4.start();

        thread4.join();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("+++++ " +Thread.currentThread().getName());
    }

    volatile Integer a = 0;

    @Test
    void simpleTest2() throws InterruptedException {

        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                /*try {
                    Thread.currentThread().sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }*/

                for(int j=0;j<10000000;j++){
                    a=a+1;
                }

                System.out.println("----- "+Thread.currentThread().getName()+" "+a);
            }
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);
        thread1.start();
        thread3.start();
        thread2.start();
        thread4.start();

        thread4.join();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("+++++ " +Thread.currentThread().getName());
    }

    @Test
    void testThreadLocal() throws InterruptedException {

        Runnable runnable = ()->{
            ThreadLocal<Integer> threadLocal = new ThreadLocal<>();
            threadLocal.set(0);
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int j=0;j<10000000;j++) {
                threadLocal.set(threadLocal.get() + 1);
            }
            System.out.println("----- "+threadLocal.get());
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread3.start();
        thread2.start();
        thread4.start();

        thread4.join();
        thread1.join();
        thread2.join();
        thread3.join();

        System.out.println("+++++ " +Thread.currentThread().getName());
    }

    @Test
    void testShpemafor() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        Semaphore semaphore = new Semaphore(2,true);
        Runnable runnable = ()->{
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                semaphore.acquire();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int j=0;j<10000000;j++) {
                atomicInteger.incrementAndGet();
            }
            semaphore.release();
            System.out.println("----- "+Thread.currentThread().getName()+" "+ atomicInteger.get());
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread3.start();
        thread2.start();
        thread4.start();

        thread4.join();
        thread1.join();
        thread2.join();
        thread3.join();


        System.out.println("+++++ " +Thread.currentThread().getName());

    }

    @Test
    void testCountDownLatch() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        CountDownLatch countDownLatch = new CountDownLatch(2);
        Runnable runnable = ()->{
            try {
                Thread.currentThread().sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            for(int j=0;j<10000000;j++) {
                atomicInteger.incrementAndGet();
            }
            System.out.println("----- "+Thread.currentThread().getName()+" "+ atomicInteger.get());
        };

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        Thread thread4 = new Thread(runnable);

        thread1.start();
        thread3.start();
        thread2.start();
        thread4.start();

        Thread.sleep(100);
        System.out.println("+++++ " +Thread.currentThread().getName());
        countDownLatch.countDown();
        System.out.println("+++++ " +Thread.currentThread().getName());
        countDownLatch.countDown();

        thread4.join();
        thread1.join();
        thread2.join();
        thread3.join();


        System.out.println("+++++ " +Thread.currentThread().getName());

    }


    @Test
    void testCyclicBarrier() throws InterruptedException {
        AtomicInteger atomicInteger = new AtomicInteger(0);
        CyclicBarrier cyclicBarrier= new CyclicBarrier(4, ()-> System.out.println("я тут"+Thread.currentThread().getName()));
        Runnable runnable = ()->{

            try {
                cyclicBarrier.await();
            } catch (InterruptedException | BrokenBarrierException e) {
                e.printStackTrace();
            }
            for(int j=0;j<10000000;j++) {
                atomicInteger.incrementAndGet();
            }
            System.out.println("----- "+Thread.currentThread().getName()+" "+ atomicInteger.get());
        };

        Thread thread1 = new Thread(runnable);
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread2 = new Thread(runnable);
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread3 = new Thread(runnable);
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Thread thread4 = new Thread(runnable);
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        thread1.start();
        thread3.start();
        thread2.start();
        thread4.start();

        Thread.sleep(100);


        thread4.join();
        thread1.join();
        thread2.join();
        thread3.join();


        System.out.println("+++++ " +Thread.currentThread().getName());

    }




}
