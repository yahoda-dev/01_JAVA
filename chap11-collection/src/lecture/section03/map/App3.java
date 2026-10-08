package lecture.section03.map;

import java.io.FileInputStream;
import java.util.Properties;

public class App3 {
    public static void main(String[] args) {
        Properties prop = new Properties();


        try(FileInputStream input = new FileInputStream("setting.properties")) {
            prop.load(input);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println(prop);


    }
}
