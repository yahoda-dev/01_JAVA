package lecture.section02.stream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class App2 {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/lecture/section02/stream/testInputStream.txt")) {
            int value = 0;
            while ((value = fr.read()) != -1) {
                System.out.println((char) value);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
