package lecture.section01.io;

import java.io.File;
import java.io.IOException;

public class App {
    public static void main(String[] args) {
        File file = new File("src/lecture/section01/io/test.txt");

        try{
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(file.length() + "bytes");
        System.out.println("path: " + file.getPath());
        System.out.println("absolute path: " + file.getAbsolutePath());
    }
}
