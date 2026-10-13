package lecture.section1.main_thread;

public class PrintingTask implements Runnable {
    private final String taskName;
    private final int count;

    public PrintingTask(String taskName, int count) {
        this.taskName = taskName;
        this.count = count;
        System.out.println(taskName + " 작업이 생성됨(" + count + "회)");
    }

    @Override
    public void run() {
        for (int i = 1; i <= count; i++) {
            System.out.println(taskName + "을 [" + Thread.currentThread().getName() + "]이 " + i + "회차 수행.");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
