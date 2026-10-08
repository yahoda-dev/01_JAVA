package lecture.section03.map;

import java.io.File;
import java.io.FileOutputStream;
import java.util.Properties;

public class App2 {
    public static void main(String[] args) {
        Properties prop = new Properties();

        prop.setProperty("language", "Korean");
        prop.setProperty("theme", "dark");
        prop.setProperty("fontsize", "16");

        System.out.println("언어: " + prop.getProperty("language"));


        try (FileOutputStream output = new FileOutputStream("setting.properties")) {
            prop.store(output, "application settings");
            System.out.println("settings.properties save finished!");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
