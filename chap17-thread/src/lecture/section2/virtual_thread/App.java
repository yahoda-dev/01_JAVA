package lecture.section2.virtual_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class App {
    public static void main(String[] args) {
        int taskCount = 10_000;


        System.out.println("=== 플랫폼 스레드 풀(200명)로 " + taskCount + "개 처리 ===");

        long start = System.currentTimeMillis();

        try (ExecutorService executor = Executors.newFixedThreadPool(200)) {

            for (int i = 0; i < taskCount; i++) {
                executor.submit(() -> sleep(100));
            }
        }

        System.out.println("소요 시간: 약 " + (System.currentTimeMillis() - start) + "ms\n"); // result: 약 5430ms


        System.out.println("=== 가상 스레드 풀로 " + taskCount + "개 처리 ===");

        start = System.currentTimeMillis();

        try (ExecutorService executor = Executors.newVirtualThreadPerTaskExecutor()) { // 가상 스레드 풀을 생성하는 코드

            for (int i = 0; i < taskCount; i++) {
                executor.submit(() -> sleep(100));
            }
        }

        System.out.println("소요 시간: 약 " + (System.currentTimeMillis() - start) + "ms\n"); // result: 약 261ms !!!

    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
