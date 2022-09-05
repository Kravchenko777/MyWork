package com.xammax.bentch;

import org.openjdk.jmh.annotations.Benchmark;

import java.io.IOException;

public class BenchmarkRunner {

    public static void main(String[] args) throws IOException {
        org.openjdk.jmh.Main.main(args);
    }

    @Benchmark
    public void getIt() throws InterruptedException{
        for(int i=0;i<10;i++){
            System.out.println("+++");
           // Thread.sleep(100);
        }
    }
}
