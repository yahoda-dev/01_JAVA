package lecture.section1.sync_async;

public class FileDownload {
    public static void downloadSync(String fileName, long downloadTimeMs) {

        System.out.println("  [" + Thread.currentThread().getName() + "] " + fileName + " 다운로드 시작");
        sleep(downloadTimeMs);
        System.out.println("  [" + Thread.currentThread().getName() + "] " + fileName + " 다운로드 완료");
    }

    public static Thread downloadAsync(String fileName, long downloadTimeMs) {

        Thread downloadThread = new Thread(() -> {
            System.out.println("  [" + Thread.currentThread().getName() + "] " + fileName + " 다운로드 시작");
            sleep(downloadTimeMs);
            System.out.println("  [" + Thread.currentThread().getName() + "] " + fileName + " 다운로드 완료");
        }, "다운로드-" + fileName);

        downloadThread.start();

        return downloadThread;
    }

    private static void sleep(long millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }
}
