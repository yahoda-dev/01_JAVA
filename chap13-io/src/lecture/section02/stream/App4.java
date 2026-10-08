package lecture.section02.stream;

import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class App4 {
    public static void main(String[] args) {
        char[] arr = {'안', '녕', '\n', '하', '세', '요'};
        try (FileWriter fos =
                     new FileWriter("src/lecture/section02/stream/testOutputStream.txt")) {
            fos.write(arr);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
