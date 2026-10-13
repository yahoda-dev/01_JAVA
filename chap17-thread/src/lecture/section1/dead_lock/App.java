package lecture.section1.dead_lock;

public class App {
    // 실습용 공유 자원
    static final Object 티셔츠 = new Object();
    static final Object 바지 = new Object();

    public static void main(String[] args) {
        Thread t1 = new Thread(
                () -> {
                    synchronized (티셔츠) {
                        System.out.println(Thread.currentThread().getName() + " : 티셔츠를 입었다.");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        System.out.println(Thread.currentThread().getName() + ": 바지 찾으러 가는 중...");

                        synchronized (바지) {
                            System.out.println(Thread.currentThread().getName() + " : 바지를 입었다.");
                        }
                    }
                }, "형"
        );

        Thread t2 = new Thread(
                () -> {
                    synchronized (바지) {
                        System.out.println(Thread.currentThread().getName() + " : 바지를 입었다.");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException e) {
                            throw new RuntimeException(e);
                        }

                        System.out.println(Thread.currentThread().getName() + ": 티셔츠 찾으러 가는 중...");

                        synchronized (티셔츠) {
                            System.out.println(Thread.currentThread().getName() + " : 티셔츠를 입었다.");
                        }
                    }
                }, "동생"
        );

        t1.start();
        t2.start();
    }
}
