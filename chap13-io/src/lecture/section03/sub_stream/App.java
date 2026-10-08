package lecture.section03.sub_stream;

import java.io.*;

public class App {
    public static void main(String[] args) {

        try (FileWriter fw = new FileWriter("src/lecture/section03/sub_stream/test_buffer.txt");
             // FileWriter 객체를 BufferedWriter의 생성자에 전달
             BufferedWriter bw = new BufferedWriter(fw);) {
            bw.write("안녕하세요\n");
            bw.write("반갑습니다\n");
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try (FileReader fr = new FileReader("src/lecture/section03/sub_stream/test_buffer.txt");
             BufferedReader br = new BufferedReader(fr);) {
            String temp;
            while((temp = br.readLine()) != null) {
                System.out.println(temp );
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
