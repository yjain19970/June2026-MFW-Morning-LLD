package org.yourcompany.mfwmorningjune26.multithreading.problems;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class Client {
    public static void main(String[] args) throws Exception {
        // Generate 1 million random numbers
        List<Integer> arr = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 1_000_000; i++) {
            arr.add(random.nextInt(100));
        }

        int cores = Runtime.getRuntime().availableProcessors();
        int chunkSize = arr.size() / cores;

        ExecutorService executor = Executors.newFixedThreadPool(cores);
        List<Future<Long>> futures = new ArrayList<>();

        for (int i = 0; i < cores; i++) {
            int start = i * chunkSize;
            int end = (i + 1) * chunkSize;
            futures.add(executor.submit(new SumMultiThreadCallable(arr, start, end)));
        }

        Long totalSum = 0L;
        for (Future<Long> f : futures) {
            totalSum += f.get();   // blocks until that chunk is done
        }

        System.out.println("Total sum: " + totalSum);
        System.out.println("Cores used: " + cores);
        executor.shutdown();
    }
}
