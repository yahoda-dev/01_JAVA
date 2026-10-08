package lecture.section02.stream;

import java.io.FileOutputStream;
import java.io.IOException;

public class App3 {
    public static void main(String[] args) {
        byte[] arr = {98, 99, 100, 101, 102};
        try (FileOutputStream fos =
                     new FileOutputStream("src/lecture/section02/stream/testOutputStream.txt")) {
            fos.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
