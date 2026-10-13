package lecture.section1.main_thread;

public class App2 {
    public static void main(String[] args) {
        PrintingTask task1 = new PrintingTask("빨래", 3);


        Thread t1 = new Thread(
                task1);

        t1.start();

        for (int i = 1; i <= 5; i++) {
            System.out.println("설거지를 [" + Thread.currentThread().getName() + "] " + i + "번 작업처리");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}