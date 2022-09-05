package com.xammax.task;


import org.junit.jupiter.api.Test;
import org.openjdk.jmh.annotations.*;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.concurrent.TimeUnit;

@SpringBootTest
@State(Scope.Benchmark)
@BenchmarkMode(Mode.AverageTime)
@OutputTimeUnit(TimeUnit.MICROSECONDS)
public class BenchmarkTest {

    @Test
    @Benchmark
    public void test() throws InterruptedException {
        getIt();
    }

    @Benchmark
    public void getIt() throws InterruptedException{
        for(int i=0;i<10;i++){
            System.out.println("+++");
            Thread.sleep(100);
        }
    }
}


