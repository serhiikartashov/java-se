package org.kartashov.part17_concurrency.examples.blocking_queue.synchronous_queue;

/**
 * @author Serhii Kartashov
 * @since 1.0.0
 */
public class PrintUtils {
    public static void print(String s) {
        System.out.println(Thread.currentThread().getName() + ":" + s);
    }
}
