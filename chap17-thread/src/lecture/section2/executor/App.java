package lecture.section2.executor;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class App {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(3);

        for (int i = 1; i <= 50; i++) {
            int taskNo = i;
            executor.submit(() -> System.out.println("[" + Thread.currentThread().getName() + "] " + taskNo + "번 일 처리"));
            sleep(300);
        }




//
//        Future<Integer> future = executor.submit(() -> 10 + 20);
//        System.out.println("계산 결과: " + future.get());

        //executor.shutdown();
    }


    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
