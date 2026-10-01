package lecture.section02.scanner;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("enter your name: ");
        String name = sc.nextLine();
        System.out.println(name);

        int age = sc.nextInt();
        System.out.println(age);
    }
}