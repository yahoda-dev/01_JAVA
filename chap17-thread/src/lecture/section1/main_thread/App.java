package lecture.section1.main_thread;

public class App {
    public static void main(String[] args) {
        Thread current = Thread.currentThread();
        System.out.println("Current Thread: " + current.getName());

        // 📝 아래의 for문은 하나의 스레드에서 순차적으로 실행되는 코드이다.
        for (int i = 0; i < 5; i++) {
            System.out.println("[ " + current.getName() + " ] " + i + "번 작업처리");
        }

        int cores = Runtime.getRuntime().availableProcessors();
        System.out.println("CPU cores: " + cores);
    }
}