package lecture.section1.sync_async;

public class App {
    public static void main(String[] args) throws InterruptedException {
        Long time;
        System.out.println("=== 동기 방식 ===");
        time = System.currentTimeMillis();
        FileDownload.downloadSync("문서.pdf", 2000);
        FileDownload.downloadSync("사진.jpg", 1500);
        FileDownload.downloadSync("영상.mp4", 4000);
        System.out.println("동기 소요 시간: " + (System.currentTimeMillis() - time));


        System.out.println("=== 비동기 방식 ===");
        time = System.currentTimeMillis();
        Thread t1 = FileDownload.downloadAsync("문서.pdf", 2000);
        Thread t2 = FileDownload.downloadAsync("사진.jpg", 1500);
        Thread t3 = FileDownload.downloadAsync("영상.mp4", 4000);

        t1.join(); t2.join(); t3.join();

        System.out.println("비동기 소요 시간: " + (System.currentTimeMillis() - time));

    }
}
