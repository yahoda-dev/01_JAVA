package lecture.section02.string;

public class App {
    public static void main(String[] args) {
        String text = "  Java Programing  ";


        System.out.println("예제 문자열[" + text +"]");
        System.out.println("String.length(): " + text.length());
        System.out.println("String.charAt(): " + text.charAt(2));
        System.out.println("Stirng.contains(): " + text.contains("Java"));
        System.out.println("String.indexOf(): " + text.indexOf("Java"));
        System.out.println("String.strip(): [" + text.strip() +"]");
        System.out.println("String.substring(): " + text.strip().substring(5));
        System.out.println("String.replace(): " + text.strip().replace("Java", "Kotlin"));
        System.out.println("String.toLowerCase(): " + text.strip().toLowerCase());
        System.out.println("String.toUpperCase(): " + text.strip().toUpperCase());

















    }
}
