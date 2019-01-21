package org.kartashov.part17_concurrency.examples.completable_future;

import java.util.concurrent.*;

public class CompletableFutureDelayExample {

    public static ExecutorService pool = Executors.newFixedThreadPool(5);

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        CompletableFuture<String> result = CompletableFuture.supplyAsync(
                () -> {
                    System.out.println(Thread.currentThread().getName() + " delay task is called");
                    return new CompletableFutureDelayExample().delay();
                },
                pool
        );

        System.out.println("isDone = " + result.isDone());
        System.out.println("isCancelled = " + result.isCancelled());

        // result.cancel(true); //You may cancel it conditionally

        String res = null; // blocked until result is returned
        try {
            res = result.get(1, TimeUnit.SECONDS);
        } catch (TimeoutException e) {
            e.printStackTrace();
        }

        System.out.println(Thread.currentThread().getName() + " result is " + res);

        pool.shutdown();
    }

    public String delay(){
        try {
            Thread.sleep(10_000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "done";
    }
}
